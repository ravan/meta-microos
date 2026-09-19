SUMMARY = "A Qt C++ Library for the Last.fm Webservices"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your rich desktop software. It is officially supported software developed \
by Last.fm staff."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "liblastfm5-1-1.1.0-2.7.aarch64.rpm"
RPM_HASH = "51499d7136536243838085b4112c41f03b45f929c4e0845411589f6de4117ab4ead65175bea3772ab038f942262e9707b01e6a7cc893fcd16727b3f0b4cf6d93"

RPROVIDES:${PN} += "liblastfm5-1 \
liblastfm5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
