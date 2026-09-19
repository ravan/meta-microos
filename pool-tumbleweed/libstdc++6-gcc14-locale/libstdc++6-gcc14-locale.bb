SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "14.4.0+git12698"

RPM_NAME = "libstdc++6-gcc14-locale-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "605bddbfbdce7160ce6b9e53f00cf6c03bdc57615cdda1846d133fb338625b8508d12124e84447c791ebffb9f6cd67fd6bdefadf8ab013db9a2b64b719d654c4"

RPROVIDES:${PN} += "libstdc++6-gcc14-locale \
libstdc++6-locale \
locale-libstdc++6-gcc14-de \
locale-libstdc++6-gcc14-fr"

RDEPENDS:${PN} += ""

inherit rpm
