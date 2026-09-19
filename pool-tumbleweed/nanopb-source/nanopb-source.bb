SUMMARY = "Source code of nanopb"
DESCRIPTION = "Source code of nanopb - a C implementation of Google's Protocol Buffers data \
format."
LICENSE = "Zlib"

PV = "0.4.9.2"

RPM_NAME = "nanopb-source-0.4.9.2-1.1.noarch.rpm"
RPM_HASH = "77dce0f244c4d25fde1aa9137e4cad982daa29448f27cae19614065b26bba62e13f51c062d0beec3e9c4b4a823e8b024a52d24aafd3bfb587baceecb309291ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanopb-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
