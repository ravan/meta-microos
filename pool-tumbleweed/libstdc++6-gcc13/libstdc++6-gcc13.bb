SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.5.0+git10516"

RPM_NAME = "libstdc++6-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "030778ede910de50936f14c389656ccbeab051cd8e795d3888b3fafb4897d017e68283848388949ed967a4d8539136880e332299dc99e5b5b85e032c9fe21e53"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6 \
libstdc++6-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
