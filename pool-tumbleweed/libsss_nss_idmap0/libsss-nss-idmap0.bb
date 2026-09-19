SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "libsss_nss_idmap0-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "cef396c6156e615727df886efc9bc7499d0e68fe51f9a88aa92b8316c0994596eea4701337a68db10065db5cab85820d12c37e985ab6a8df92829547272cee15"

RPROVIDES:${PN} += "libsss-nss-idmap.so.0 \
libsss-nss-idmap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
