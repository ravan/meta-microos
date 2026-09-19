SUMMARY = "Example plugins for nbdkit"
DESCRIPTION = "This package contains example plugins for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-example-plugins-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "a159659cb1c54ce9c6203b43b6fb1fb6266dbea505033ffe124ec3a340912bbaabf2adb77bd7844039755f7da25161e78cc9d4a7978aa27290520a8e7f68eaca"

RPROVIDES:${PN} += "nbdkit-example-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nbdkit-server"

inherit rpm
