SUMMARY = "Header files for AppStream's Qt 6 bindings"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using the Qt bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "appstream-qt6-devel-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "d60fc2acf9e08919288d93ae300e9628862a9d5ba5fc1cc8b968b870e1eb233ceeab0b597a80934cbb4521e31804ac4e079b9f3c3c4c6882fc7c4d5849ce9919"

RPROVIDES:${PN} += "appstream-qt6-devel \
cmake-AppStreamQt"

RDEPENDS:${PN} += "libAppStreamQt3 \
libappstream5"

inherit rpm
