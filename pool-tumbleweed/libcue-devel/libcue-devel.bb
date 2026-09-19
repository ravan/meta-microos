SUMMARY = "Development files for libcue, a CUE sheet parsing library"
DESCRIPTION = "libcue parses so-called cue sheets from a char string or a FILE \
pointer. \
 \
This package contains the development library symlink and header \
files."
LICENSE = "GPL-2.0-only"

PV = "2.3.0"

RPM_NAME = "libcue-devel-2.3.0-1.11.aarch64.rpm"
RPM_HASH = "82ea7d39815cd2bd1612ec4ee68384160b44b82701d0f6b6c10fd5b74669b6bfa1187424c2d854792ccb3c034df6e66292b56eb6812b85cc83b88454253ac489"

RPROVIDES:${PN} += "libcue-devel \
pkgconfig-libcue"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcue2"

inherit rpm
