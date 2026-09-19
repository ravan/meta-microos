SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "16.2.0+git9497"

RPM_NAME = "libstdc++6-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "f2c0674c886e599a4e4cfbf7126f18a886db00fe1ed0b9de330e7f1adc9f0bc3849bcde961b98ddba94758e5f17c2a79842f6d7602da0681b662c70c7d098a52"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
