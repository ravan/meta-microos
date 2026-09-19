SUMMARY = "Development Headers, Documentation, and Libraries for Pidgin"
DESCRIPTION = "The pidgin-devel package contains the header files, developer \
documentation, and libraries required for development of Pidgin scripts \
and plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.14"

RPM_NAME = "pidgin-devel-2.14.14-2.3.aarch64.rpm"
RPM_HASH = "c5bfff7eedc731e19b084127687d4b226358848279262e998627643db7e4e50fad77590f9bbecffeb9f8f7b4eaa42ac83325369ca4428b0cc019cbaa2f9d1ada"

RPROVIDES:${PN} += "pidgin-devel \
pkgconfig-pidgin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpurple-devel \
pidgin \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-purple"

inherit rpm
