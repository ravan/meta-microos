SUMMARY = "Haskell asn1-types library development files"
DESCRIPTION = "This package provides the Haskell asn1-types library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-devel-0.3.4-5.31.aarch64.rpm"
RPM_HASH = "343a8dc7b8557e6967a0954a97e27f0de75747abbd60777fe898353729759ac3da4e2e662d112be5f2099a418345fd2b8ef85b49e9a20f62c3ae47513f1f25bb"

RPROVIDES:${PN} += "ghc-asn1-types-devel \
ghc-devel-asn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asn1-types \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-hourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o \
ghc-devel-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu"

inherit rpm
