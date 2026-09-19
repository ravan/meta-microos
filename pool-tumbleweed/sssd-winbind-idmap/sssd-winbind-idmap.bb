SUMMARY = "The sss idmap backend for Winbind"
DESCRIPTION = "The idmap_sss module provides a way for Winbind to call SSSD to map \
UIDs/GIDs and SIDs."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-winbind-idmap-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "79bb10fc71738d8a4ce4da9bf7a8947eadea7d4897d6105fa1a280aeaae94065a013afd753b11cba697165f8ab8efe9d63f8a332614a7060c35a8c48dc31a7ef"

RPROVIDES:${PN} += "sssd-winbind-idmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-idmap.so.0 \
libsss-nss-idmap.so.0 \
libtalloc.so.2"

inherit rpm
