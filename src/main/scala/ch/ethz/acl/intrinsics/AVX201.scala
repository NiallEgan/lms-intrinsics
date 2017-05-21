package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX201 extends IntrinsicsBase {
  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUB_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUB_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUB_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUBS_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUBS_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUBS_EPU8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUBS_EPU16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of 256 bits (representing integer data) in "a" and
   * "b", and store the result in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_XOR_SI256(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKHI_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKHI_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKHI_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKHI_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKLO_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKLO_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKLO_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKLO_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_sub_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUB_EPI16(a, b)
  }
            
  def _mm256_sub_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUB_EPI32(a, b)
  }
            
  def _mm256_sub_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUB_EPI64(a, b)
  }
            
  def _mm256_subs_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUBS_EPI8(a, b)
  }
            
  def _mm256_subs_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUBS_EPI16(a, b)
  }
            
  def _mm256_subs_epu8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUBS_EPU8(a, b)
  }
            
  def _mm256_subs_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUBS_EPU16(a, b)
  }
            
  def _mm256_xor_si256(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_XOR_SI256(a, b)
  }
            
  def _mm256_unpackhi_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKHI_EPI8(a, b)
  }
            
  def _mm256_unpackhi_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKHI_EPI16(a, b)
  }
            
  def _mm256_unpackhi_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKHI_EPI32(a, b)
  }
            
  def _mm256_unpackhi_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKHI_EPI64(a, b)
  }
            
  def _mm256_unpacklo_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKLO_EPI8(a, b)
  }
            
  def _mm256_unpacklo_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKLO_EPI16(a, b)
  }
            
  def _mm256_unpacklo_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKLO_EPI32(a, b)
  }
            
  def _mm256_unpacklo_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKLO_EPI64(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_SUB_EPI16 (a, b) =>
      _mm256_sub_epi16(f(a), f(b))
    case MM256_SUB_EPI32 (a, b) =>
      _mm256_sub_epi32(f(a), f(b))
    case MM256_SUB_EPI64 (a, b) =>
      _mm256_sub_epi64(f(a), f(b))
    case MM256_SUBS_EPI8 (a, b) =>
      _mm256_subs_epi8(f(a), f(b))
    case MM256_SUBS_EPI16 (a, b) =>
      _mm256_subs_epi16(f(a), f(b))
    case MM256_SUBS_EPU8 (a, b) =>
      _mm256_subs_epu8(f(a), f(b))
    case MM256_SUBS_EPU16 (a, b) =>
      _mm256_subs_epu16(f(a), f(b))
    case MM256_XOR_SI256 (a, b) =>
      _mm256_xor_si256(f(a), f(b))
    case MM256_UNPACKHI_EPI8 (a, b) =>
      _mm256_unpackhi_epi8(f(a), f(b))
    case MM256_UNPACKHI_EPI16 (a, b) =>
      _mm256_unpackhi_epi16(f(a), f(b))
    case MM256_UNPACKHI_EPI32 (a, b) =>
      _mm256_unpackhi_epi32(f(a), f(b))
    case MM256_UNPACKHI_EPI64 (a, b) =>
      _mm256_unpackhi_epi64(f(a), f(b))
    case MM256_UNPACKLO_EPI8 (a, b) =>
      _mm256_unpacklo_epi8(f(a), f(b))
    case MM256_UNPACKLO_EPI16 (a, b) =>
      _mm256_unpacklo_epi16(f(a), f(b))
    case MM256_UNPACKLO_EPI32 (a, b) =>
      _mm256_unpacklo_epi32(f(a), f(b))
    case MM256_UNPACKLO_EPI64 (a, b) =>
      _mm256_unpacklo_epi64(f(a), f(b))

    case Reflect(MM256_SUB_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUB_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUB_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUB_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUB_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUB_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUBS_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUBS_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUBS_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUBS_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUBS_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUBS_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_XOR_SI256 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_XOR_SI256 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX201 extends CGenIntrinsics {

  val IR: AVX2
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM256_SUB_EPI16(a, b) =>
      emitValDef(sym, s"_mm256_sub_epi16(${quote(a)}, ${quote(b)})")
    case MM256_SUB_EPI32(a, b) =>
      emitValDef(sym, s"_mm256_sub_epi32(${quote(a)}, ${quote(b)})")
    case MM256_SUB_EPI64(a, b) =>
      emitValDef(sym, s"_mm256_sub_epi64(${quote(a)}, ${quote(b)})")
    case MM256_SUBS_EPI8(a, b) =>
      emitValDef(sym, s"_mm256_subs_epi8(${quote(a)}, ${quote(b)})")
    case MM256_SUBS_EPI16(a, b) =>
      emitValDef(sym, s"_mm256_subs_epi16(${quote(a)}, ${quote(b)})")
    case MM256_SUBS_EPU8(a, b) =>
      emitValDef(sym, s"_mm256_subs_epu8(${quote(a)}, ${quote(b)})")
    case MM256_SUBS_EPU16(a, b) =>
      emitValDef(sym, s"_mm256_subs_epu16(${quote(a)}, ${quote(b)})")
    case MM256_XOR_SI256(a, b) =>
      emitValDef(sym, s"_mm256_xor_si256(${quote(a)}, ${quote(b)})")
    case MM256_UNPACKHI_EPI8(a, b) =>
      emitValDef(sym, s"_mm256_unpackhi_epi8(${quote(a)}, ${quote(b)})")
    case MM256_UNPACKHI_EPI16(a, b) =>
      emitValDef(sym, s"_mm256_unpackhi_epi16(${quote(a)}, ${quote(b)})")
    case MM256_UNPACKHI_EPI32(a, b) =>
      emitValDef(sym, s"_mm256_unpackhi_epi32(${quote(a)}, ${quote(b)})")
    case MM256_UNPACKHI_EPI64(a, b) =>
      emitValDef(sym, s"_mm256_unpackhi_epi64(${quote(a)}, ${quote(b)})")
    case MM256_UNPACKLO_EPI8(a, b) =>
      emitValDef(sym, s"_mm256_unpacklo_epi8(${quote(a)}, ${quote(b)})")
    case MM256_UNPACKLO_EPI16(a, b) =>
      emitValDef(sym, s"_mm256_unpacklo_epi16(${quote(a)}, ${quote(b)})")
    case MM256_UNPACKLO_EPI32(a, b) =>
      emitValDef(sym, s"_mm256_unpacklo_epi32(${quote(a)}, ${quote(b)})")
    case MM256_UNPACKLO_EPI64(a, b) =>
      emitValDef(sym, s"_mm256_unpacklo_epi64(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
