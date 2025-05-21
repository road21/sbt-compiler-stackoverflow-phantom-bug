//> using scala 3.3.6

import scala.compiletime.*
import scala.deriving.Mirror

inline def f[h]: String = constValue[h].asInstanceOf[String]

inline def loopUnrolled[T <: Tuple]: List[String] =
    inline erasedValue[T] match
      case _: EmptyTuple => Nil
      case _: (h1 *: h2 *: h3 *: h4 *: h5 *: h6 *: h7 *: h8 *: h9 *: h10 *:
        h11 *: h12 *: h13 *: h14 *: h15 *: h16 *: ts) =>
        f[h1] :: f[h2] :: f[h3] :: f[h4] :: f[h5] :: f[h6] :: f[h7] :: f[h8]
          :: f[h9] :: f[h10] :: f[h11] :: f[h12] :: f[h13] :: f[h14] :: f[h15] :: f[h16]
          :: loopUnrolled[ts]
      case _: (h1 *: h2 *: h3 *: h4 *: ts) =>
        f[h1] :: f[h2] :: f[h3] :: f[h4] :: loopUnrolled[ts]
      case _: (h *: ts) => f[h] :: loopUnrolled[ts]

// format: off
case class VeryLong(
                       p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String,
                       p11: String, p12: String, p13: String, p14: String, p15: String, p16: String, p17: String, p18: String, p19: String, p20: String,
                       p21: String, p22: String, p23: String, p24: String, p25: String, p26: String, p27: String, p28: String, p29: String, p30: String,
                       p31: String, p32: String, p33: String, p34: String, p35: String, p36: String, p37: String, p38: String, p39: String, p40: String,
                       p41: String, p42: String, p43: String, p44: String, p45: String, p46: String, p47: String, p48: String, p49: String, p50: String,
                       p51: String, p52: String, p53: String, p54: String, p55: String, p56: String, p57: String, p58: String, p59: String, p60: String,
                       p61: String, p62: String, p63: String, p64: String, p65: String, p66: String, p67: String, p68: String, p69: String, p70: String,
                       p71: String, p72: String, p73: String, p74: String, p75: String, p76: String, p77: String, p78: String, p79: String, p80: String,
                       p81: String, p82: String, p83: String, p84: String, p85: String, p86: String, p87: String, p88: String, p89: String, p90: String,
                       p91: String, p92: String, p93: String, p94: String, p95: String, p96: String, p97: String, p98: String, p99: String, p100: String,
                       p101: String, p102: String, p103: String, p104: String, p105: String, p106: String, p107: String, p108: String, p109: String, p110: String,
                       p111: String, p112: String, p113: String, p114: String, p115: String, p116: String, p117: String, p118: String, p119: String, p120: String,
                       p121: String, p122: String, p123: String, p124: String, p125: String, p126: String, p127: String, p128: String, p129: String, p130: String,
                       p131: String, p132: String, p133: String, p134: String, p135: String, p136: String, p137: String, p138: String, p139: String, p140: String,
                       p141: String, p142: String, p143: String, p144: String, p145: String, p146: String, p147: String, p148: String, p149: String, p150: String,
                       p151: String, p152: String, p153: String, p154: String, p155: String, p156: String, p157: String, p158: String, p159: String, p160: String,
                       p161: String, p162: String, p163: String, p164: String, p165: String, p166: String, p167: String, p168: String, p169: String, p170: String,
                       p171: String, p172: String, p173: String, p174: String, p175: String, p176: String, p177: String, p178: String, p179: String, p180: String,
                       p181: String, p182: String, p183: String, p184: String, p185: String, p186: String, p187: String, p188: String, p189: String, p190: String,
                       p191: String, p192: String, p193: String, p194: String, p195: String, p196: String, p197: String, p198: String, p199: String, p200: String,
                       p201: String, p202: String, p203: String, p204: String, p205: String, p206: String, p207: String, p208: String, p209: String, p210: String,
                       p211: String, p212: String, p213: String, p214: String, p215: String, p216: String, p217: String, p218: String, p219: String, p220: String,
                       p221: String, p222: String, p223: String, p224: String, p225: String, p226: String, p227: String, p228: String, p229: String, p230: String,
                       p231: String, p232: String, p233: String, p234: String, p235: String, p236: String, p237: String, p238: String, p239: String, p240: String,
                       p241: String, p242: String, p243: String, p244: String, p245: String, p246: String, p247: String, p248: String, p249: String, p250: String,
                       p251: String, p252: String, p253: String, p254: String
)
// format: on

@main def run: Unit =
  val mirror = summon[Mirror.ProductOf[VeryLong]]
  println(loopUnrolled[mirror.MirroredElemLabels])
