SUMMARY = "Python 3 plugin for nbdkit"
DESCRIPTION = "This package lets you write Python 3 plugins for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-python-plugin-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "12da3d0c16572f7aa1f34048bd0b8a9882a5805e02f79ab771b74e61a15602282094f77170fb09c815d9e991b0e202d7868382f8bb37e356411826cf4b5af0b3"

RPROVIDES:${PN} += "nbdkit-python-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
nbdkit-server"

inherit rpm
