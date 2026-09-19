SUMMARY = "Command line client to QStandardPaths"
DESCRIPTION = "Command line client to QStandardPaths."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qtpaths-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "45b72da25c5eb4e5983a1b14cf0ca56f541a1d074eb915a2cd90ffdc0d6e6955a872f0981c0680d010769b2fdf85fc487d397c9f9ee6f632e9cebe7fad3861c5"

RPROVIDES:${PN} += "libqt5-qtpaths"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6"

inherit rpm
