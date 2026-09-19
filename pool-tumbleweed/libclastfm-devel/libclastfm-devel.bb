SUMMARY = "Unofficial C-API for the Last.fm Web Service"
DESCRIPTION = "libclastfm development files. \
 \
libclastfm is an unofficial C-API for the Last.fm web service written \
with libcurl. Has support for Album, Artist and User API methods as well \
as full audio scrobbler support."
LICENSE = "GPL-3.0+"

PV = "0.5"

RPM_NAME = "libclastfm-devel-0.5-9.37.aarch64.rpm"
RPM_HASH = "6a19da415b1e4fddcb994522f9d20a89c94c516d57765e7b07073fb6a51e4b877dd3222fc5e5be3be608a17d98e6957a8c941986aded3c1cfd8d58c2c7c7fcd1"

RPROVIDES:${PN} += "libclastfm-devel \
pkgconfig-libclastfm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclastfm0 \
pkgconfig-libcurl"

inherit rpm
