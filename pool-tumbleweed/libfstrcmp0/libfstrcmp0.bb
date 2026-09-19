SUMMARY = "Fuzzy string compare"
DESCRIPTION = "A library for fuzzy comparisons of strings and byte arrays."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.D001"

RPM_NAME = "libfstrcmp0-0.7.D001-1.25.aarch64.rpm"
RPM_HASH = "dbfe6b6317ed8174aefdc4ba190427428e5d284d013476297f0d4474a01940217dc3a83310811b4f95ced1301cc8edbc62004cc62bb33595e5b823abb5fb5a44"

RPROVIDES:${PN} += "libfstrcmp.so.0 \
libfstrcmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
