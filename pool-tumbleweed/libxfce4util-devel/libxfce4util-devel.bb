SUMMARY = "Development Files for libxfce4util"
DESCRIPTION = "This package contains the API documentation and development files needed for \
developing applications based on libxfce4util."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.1"

RPM_NAME = "libxfce4util-devel-4.20.1-1.5.aarch64.rpm"
RPM_HASH = "9aa399e1daeab2b6e6848dde6b4c464e9e59d93dd8bf23c151c44c62b6ef84e4812654c10a95b1e5639068cab5e99d397a483598f919fa5d4cff6fafabeb4528"

RPROVIDES:${PN} += "libxfce4util-devel \
pkgconfig-libxfce4util-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxfce4util-tools \
libxfce4util7 \
pkgconfig-glib-2.0 \
typelib-1-0-Libxfce4util-1-0"

inherit rpm
