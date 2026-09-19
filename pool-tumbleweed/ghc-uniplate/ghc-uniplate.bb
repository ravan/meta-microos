SUMMARY = "Help writing simple, concise and fast generic operations"
DESCRIPTION = "Uniplate is library for writing simple and concise generic operations. \
Uniplate has similar goals to the original Scrap Your Boilerplate work, but is \
substantially simpler and faster. \
 \
To get started with Uniplate you should import one of the three following \
modules: \
 \
* 'Data.Generics.Uniplate.Data' - to quickly start writing generic functions. \
Most users should start by importing this module. \
 \
* 'Data.Generics.Uniplate.Direct' - a replacement for \
'Data.Generics.Uniplate.Data' with substantially higher performance (around 5 \
times), but requires writing instance declarations. \
 \
* 'Data.Generics.Uniplate.Operations' - definitions of all the operations \
defined by Uniplate. Both the above two modules re-export this module. \
 \
In addition, some users may want to make use of the following modules: \
 \
* 'Data.Generics.Uniplate.Zipper' - a zipper built on top of Uniplate \
instances. \
 \
* 'Data.Generics.SYB' - users transitioning from the Scrap Your Boilerplate \
library. \
 \
* 'Data.Generics.Compos' - users transitioning from the Compos library. \
 \
* 'Data.Generics.Uniplate.DataOnly' - users making use of both 'Data' and \
'Direct' to avoid getting instance conflicts."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-1.6.13-4.44.aarch64.rpm"
RPM_HASH = "7504d8961c6f72ba5c69e736d04c43a8334273461eaf996bb1dd4ad9e9eb0053345448184380a207efd3276477a62990691d24488c94a0ca88cb677725294fe4"

RPROVIDES:${PN} += "ghc-uniplate \
libHSuniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
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
libHSsyb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
