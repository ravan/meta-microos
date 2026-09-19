SUMMARY = "Common build files of the GNOME C++ bindings"
DESCRIPTION = "The mm-common module provides the build infrastructure and utilities \
shared among the GNOME C++ binding libraries.  It is a required dependency \
to build glibmm and gtkmm from git."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "mm-common-1.0.8-1.2.noarch.rpm"
RPM_HASH = "99a6025a063c6ad3915937a9a49f71080d76f1ce21ecc3686b5b9a21b1e29d266d8230df0052d5c0be82e60bba1c0898e044b1ded76244aec33b62ad8ee61220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mm-common \
pkgconfig-mm-common-libstdc++ \
pkgconfig-mm-common-util"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/pkg-config \
/usr/bin/sh"

inherit rpm
