SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.5.0+git10516"

RPM_NAME = "libatomic1-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "9e8377b46337fc02eb87f426db322503d8efa50546634ea3fd53aa4f6e8249d8a5032bf9de46c3ffaf0885665f8d011722f8f724fd6a29926bd110d7e91384f4"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1 \
libatomic1-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
