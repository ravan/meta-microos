SUMMARY = "Development Libraries and Header Files for liboop"
DESCRIPTION = "This package contains the static libraries and header files needed to \
develop programs which make use of the liboop programming interface."
LICENSE = "LGPL-2.1+"

PV = "1.0.1"

RPM_NAME = "liboop-devel-1.0.1-2.29.aarch64.rpm"
RPM_HASH = "1853b77d9db2aeaeb9453dae12da774d6e278cb1b6c5fc40a1bc2e65e6c14eb7200fc1ef7793ac4ec6ba85c5e845c2f18d6f48ce98bf98f0aaf4cc56fa148a56"

RPROVIDES:${PN} += "liboop-devel \
pkgconfig-liboop \
pkgconfig-liboop-glib2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboop4 \
pkgconfig-glib-2.0"

inherit rpm
