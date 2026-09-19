SUMMARY = "Files for Developing with libmwaw"
DESCRIPTION = "Libmwaw is a new project for converting many pre-OSX MAC text formats. \
This package contains the libmwaw development files."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-devel-0.3.21-3.10.aarch64.rpm"
RPM_HASH = "7745049c0c326dd9a5fc333eefded72e91c88f6a4d6b73868e2483450f5868e933fbc7ab3368d5a9091eb9f5f7e668f213839dd568ebb7707bc601a87bef9d9c"

RPROVIDES:${PN} += "libmwaw-devel \
pkgconfig-libmwaw-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmwaw-0-3-3 \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0"

inherit rpm
