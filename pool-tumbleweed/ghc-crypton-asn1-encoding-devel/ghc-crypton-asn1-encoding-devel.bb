SUMMARY = "Haskell crypton-asn1-encoding library development files"
DESCRIPTION = "This package provides the Haskell crypton-asn1-encoding library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "ghc-crypton-asn1-encoding-devel-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "d692314c839e14845798a04e0fa63b7cab61f28787b1c3f9e06b999cc301a8aa496b43c7568c2b3cf7d48a7c09107f8a94db0cbea908a7315158cbba656d61f3"

RPROVIDES:${PN} += "ghc-crypton-asn1-encoding-devel \
ghc-devel-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-asn1-encoding \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-devel-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l"

inherit rpm
