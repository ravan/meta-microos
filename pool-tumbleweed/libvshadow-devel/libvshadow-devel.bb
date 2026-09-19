SUMMARY = "Development files for libvshadow"
DESCRIPTION = "The libvshadow-devel package contains libraries and header files for \
developing applications that use libvshadow. \
 \
The package contains /usr/share/doc/packages/libvshadow: \
 \
* OSDFC 2012: Paper - Windowless Shadow Snapshots \
* OSDFC 2012: Slides - Windowless Shadow Snapshots"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "libvshadow-devel-20260714-1.2.aarch64.rpm"
RPM_HASH = "0a997f151f05dc317db3817348fcc30f521af5a0e63e876333de5c355315133d7e65f6007b5fe946cbf390470c5cdade44baefc00629403273249be7e493eea3"

RPROVIDES:${PN} += "libvshadow-devel \
pkgconfig-libvshadow"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvshadow1"

inherit rpm
