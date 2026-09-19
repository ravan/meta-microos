SUMMARY = "INI file parser for C"
DESCRIPTION = "Library to process config files in INI format into a libcollection data \
structure"
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libini_config8-2.0.0-29.3.aarch64.rpm"
RPM_HASH = "c2cb2e9f99b71e2283c33fb4977ca16aa7f2c8e361cb54941a3510c09cd981cb669a249b3534cd2ea60bd45b8550f6bca025736955b53bf73baf22771930fe72"

RPROVIDES:${PN} += "libini-config.so.8 \
libini-config8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
