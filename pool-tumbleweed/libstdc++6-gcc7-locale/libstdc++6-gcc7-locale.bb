SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-gcc7-locale-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "1a166e34ed2b9ab22f18d999ae9bc1055c6d693087830fb67de4f2baaec38207e759661c4308ae8afabffcb4b7b1c51f049bd5a5516d359cf8d8cf09b93546e1"

RPROVIDES:${PN} += "libstdc++6-gcc7-locale \
libstdc++6-locale \
locale-libstdc++6-gcc7-de \
locale-libstdc++6-gcc7-fr"

RDEPENDS:${PN} += ""

inherit rpm
