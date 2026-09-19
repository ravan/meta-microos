SUMMARY = "POSIX Backend for 'Text.Regex' (regex-base)"
DESCRIPTION = "The POSIX regex backend for <//hackage.haskell.org/package/regex-base \
regex-base>. \
 \
The main appeal of this backend is that it's very lightweight due to its \
reliance on the ubiquitous \
<https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/regex.h.html POSIX.2 \
regex> facility that is provided by the standard C library on most POSIX \
platforms. \
 \
See also <https://wiki.haskell.org/Regular_expressions> for more information."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.2"

RPM_NAME = "ghc-regex-posix-0.96.0.2-1.12.aarch64.rpm"
RPM_HASH = "b4b9de2af32cf244973c6a2d25c5155c53f0f5ced482c2a9b34a3dad7c7d364d3d28105480f3f2e45fc1f81fd3e3760ca5bda01b9748b7575277ad96cabc51e1"

RPROVIDES:${PN} += "ghc-regex-posix \
libHSregex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSregex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
