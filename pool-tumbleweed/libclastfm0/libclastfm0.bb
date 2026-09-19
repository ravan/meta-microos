SUMMARY = "Unofficial C-API for the Last.fm Web Service"
DESCRIPTION = "libclastfm shared library. \
 \
libclastfm is an unofficial C-API for the Last.fm web service written \
with libcurl. Has support for Album, Artist and User API methods as well \
as full audio scrobbler support."
LICENSE = "GPL-3.0+"

PV = "0.5"

RPM_NAME = "libclastfm0-0.5-9.37.aarch64.rpm"
RPM_HASH = "91433ba6e6523cd8e6f1658dbfcd14049401cbfeca80ed86042eb245f4b934980128e136c309fb9d0ea27f71e91b31adf4ed744a03c4a13a9a523c0ffb971406"

RPROVIDES:${PN} += "libclastfm.so.0 \
libclastfm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
