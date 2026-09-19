SUMMARY = "Development Package for DSSI plugins"
DESCRIPTION = "This package contains files to be needed for building DSSI plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.1.1"

RPM_NAME = "dssi-devel-1.1.1-14.8.aarch64.rpm"
RPM_HASH = "82ad832b8a6d663914bd85ab55e5958f54fb6ea3603a0e7f5ca46da17854997bbbcb86f468f9ffa4fe370019cf2a9b2ce4470dc301b9248a5782bb81b3725f53"

RPROVIDES:${PN} += "dssi-devel \
pkgconfig-dssi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ladspa-devel"

inherit rpm
