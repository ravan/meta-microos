SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "15.3.0+git11272"

RPM_NAME = "libstdc++6-gcc15-locale-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "604edd116182fda51af6ebe6b1130b4ff7fb0547ae72ef24e826e8e06ea7993aa40c14828a05d7bc217c88ee7826ff4cbdfc7eb2ce4eac3a648adf15a7ba5a90"

RPROVIDES:${PN} += "libstdc++6-gcc15-locale \
libstdc++6-locale \
locale-libstdc++6-gcc15-de \
locale-libstdc++6-gcc15-fr"

RDEPENDS:${PN} += ""

inherit rpm
