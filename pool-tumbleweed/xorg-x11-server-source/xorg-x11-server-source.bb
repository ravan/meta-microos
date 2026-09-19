SUMMARY = "Source code of X.Org server"
DESCRIPTION = "This package contains patched sources of X.Org Server."
LICENSE = "MIT"

PV = "21.1.24"

RPM_NAME = "xorg-x11-server-source-21.1.24-1.2.aarch64.rpm"
RPM_HASH = "905f03b0b6c08d666765f3b8e35347026e4d46826ca46b5df6609ad8ddfd01a1c28e089c972c8b7f45c70173eaf69fb5b2c57a562e636308111c026faa1d282c"

RPROVIDES:${PN} += "xorg-x11-server-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
