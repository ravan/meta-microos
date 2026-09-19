SUMMARY = "Haskell crypton-asn1-types library development files"
DESCRIPTION = "This package provides the Haskell crypton-asn1-types library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-crypton-asn1-types-devel-0.4.1-1.3.aarch64.rpm"
RPM_HASH = "aca650a357ad88d99f2d114c958525c4f8146d790c3d3713355924be3f5db3ecebe3fd33878901767f7a938fc32e57d846422c3aa96bf4c300a4177bf904810a"

RPROVIDES:${PN} += "ghc-crypton-asn1-types-devel \
ghc-devel-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-asn1-types \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-1.0-GqCyVT5DfwtBcN8MC2i0Li \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l"

inherit rpm
