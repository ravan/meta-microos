SUMMARY = "Skein, a family of cryptographic hash functions.  Includes Skein-MAC as well"
DESCRIPTION = "Skein (<http://www.skein-hash.info/>) is a family of fast secure cryptographic \
hash functions designed by Niels Ferguson, Stefan Lucks, Bruce Schneier, Doug \
Whiting, Mihir Bellare, Tadayoshi Kohno, Jon Callas and Jesse Walker. \
 \
This package uses bindings to the optimized C implementation of Skein. \
We provide a high-level interface (see module 'Crypto.Skein') to some of the \
Skein use cases. We also provide a low-level interface (see module \
'Crypto.Skein.Internal') should you need to use Skein in a different way. \
 \
Currently we have support for Skein as cryptographic hash function as Skein as \
a message authentication code (Skein-MAC). For examples of how to use this \
package, see 'Crypto.Skein' module documentation. \
 \
This package includes Skein v1.3. Versions of this package before 1.0.0 \
implemented Skein v1.1."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-1.0.9.4-4.26.aarch64.rpm"
RPM_HASH = "ff992baa0584fbf487c1df1b54f24894e1fed995a589ec91176f8fb83fd33d82c47fb8a25549d5fe88ca7d94313c9c355c43969b8a59dca33ac80130c8374968"

RPROVIDES:${PN} += "ghc-skein \
libHSskein-1.0.9.4-1EnnjgQJNmMDn7VwfDrKcW-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScrypto-api-0.13.3-BvysNl9crxvRkhKzviyjB-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSentropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
