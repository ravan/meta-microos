SUMMARY = "Derive Template Haskell's Lift class for datatypes"
DESCRIPTION = "Derive Template Haskell's 'Lift' class for datatypes using 'TemplateHaskell'. \
The functionality in this package has largely been subsumed by the 'DeriveLift' \
language extension, which is available in GHC 8.0 and later versions. \
As such, this package is only useful as a way to backport bugfixes to \
'DeriveLift' in later GHC versions back to older GHCs. \
 \
The following libraries are related: \
 \
* The <https://hackage.haskell.org/package/th-orphans th-orphans> package \
provides instances for 'template-haskell' syntax types. \
 \
* The <http://hackage.haskell.org/package/th-lift-instances th-lift-instances> \
package provides 'Lift' instances for types in 'base', 'text', 'bytestring', \
'vector', etc. Some of these instances are only provided for old versions of \
their respective libraries, as the same 'Lift' instances are also present \
upstream on newer versions."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.7"

RPM_NAME = "ghc-th-lift-0.8.7-1.3.aarch64.rpm"
RPM_HASH = "f17d1f96892ab6c569d4046b31049ce4ff4be7ddbab0206f4d293fc47de93ddceedde2ad25b7835584ef008e3679aaf8f6bc6f5f97bf99b60b9c86ae8f193f8b"

RPROVIDES:${PN} += "ghc-th-lift \
libHSth-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
