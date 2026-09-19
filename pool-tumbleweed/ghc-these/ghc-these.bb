SUMMARY = "An either-or-both data type"
DESCRIPTION = "This package provides a data type 'These a b' which can hold a value of either \
type or values of each type. This is usually thought of as an 'inclusive or' \
type (contrasting 'Either a b' as 'exclusive or') or as an 'outer join' type \
(contrasting '(a, b)' as 'inner join'). \
 \
' data These a b = This a | That b | These a b ' \
 \
Since version 1, this package was split into parts: \
 \
* <https://hackage.haskell.org/package/semialign semialign> For 'Align' and \
'Zip' type-classes. \
 \
* <https://hackage.haskell.org/package/semialign-indexed semialign-indexed> For \
'SemialignWithIndex' class, providing 'ialignWith' and 'izipWith'. \
 \
* <https://hackage.haskell.org/package/these-lens these-lens> For lens \
combinators. \
 \
* <http://hackage.haskell.org/package/monad-chronicle monad-chronicle> For \
transformers variant of 'These'."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ghc-these-1.2.1-4.2.aarch64.rpm"
RPM_HASH = "cdae188f8804ed165ce801a96311192f694b50fbeb42cdaab8fb0901f5c174b84b75fbef32780993323230ff544cca96a275efc661ca94a8c2f7d02cdc2d3ef5"

RPROVIDES:${PN} += "ghc-these \
libHSthese-1.2.1-IItOvRyyn8cFsXxaqiOQHG-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
