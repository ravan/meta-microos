SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.5.0+git10516"

RPM_NAME = "libgcc_s1-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "160d24cb00c28133d38673813ee57140123c6845aed8e8101072c8024b2f0c3c4619b284d8b4d4453681a76a13abe381178282531683cbf1c11610ea50d8f845"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1 \
libgcc-s1-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
