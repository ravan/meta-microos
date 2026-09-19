SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.5.0+git10516"

RPM_NAME = "libstdc++6-gcc13-locale-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "3269a633a01db6b01cd1f402bb64be989812bef746e1830451aabce72cb300d8b5f5128940dd21fe0502869fc374bfcea9990bc081bc0876272901ac2f29436d"

RPROVIDES:${PN} += "libstdc++6-gcc13-locale \
libstdc++6-locale \
locale-libstdc++6-gcc13-de \
locale-libstdc++6-gcc13-fr"

RDEPENDS:${PN} += ""

inherit rpm
