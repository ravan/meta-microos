SUMMARY = "Haskell crypton-asn1-encoding profiling library"
DESCRIPTION = "This package provides the Haskell crypton-asn1-encoding profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "ghc-crypton-asn1-encoding-prof-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "4f05c2b9dfba223a4d5a115572930245394e028eed714d87c6a998a58592d5b197814c0535ee5eb702c522ec9d6296fe8785e7066ae1be0a5a01567f6d893fc7"

RPROVIDES:${PN} += "ghc-crypton-asn1-encoding-prof \
ghc-prof-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1"

RDEPENDS:${PN} += "ghc-crypton-asn1-encoding-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-prof-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l"

inherit rpm
