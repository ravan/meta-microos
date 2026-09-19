SUMMARY = "An integrated email, news feeds, chat, and newsgroups client"
DESCRIPTION = "Thunderbird is a free, open-source, cross-platform application for \
managing email, news feeds, chat, and news groups. It is a local \
(rather than browser- or web-based) email application that is powerful \
yet easy to use."
LICENSE = "MPL-2.0"

PV = "140.15.0"

RPM_NAME = "MozillaThunderbird-140.15.0-1.1.aarch64.rpm"
RPM_HASH = "dd99fbdd67106cf47d4905a01024f0654fd650bdef94a0c0e61e9adb16ac216fce907d08196a67181dc762f9a18fac99eac5a8d7ab87251910205d165bc4cc7d"

RPROVIDES:${PN} += "MozillaThunderbird \
MozillaThunderbird-devel \
appdata- \
appdata-thunderbird.appdata.xml \
thunderbird"

RDEPENDS:${PN} += "/usr/bin/sh \
MozillaThunderbird-openpgp \
coreutils \
desktop-file-utils \
fileutils \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libasound.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfreetype6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libpango-1.0.so.0 \
libplc4.so \
libplds4.so \
libsmime3.so \
libssl3.so \
libstdc++.so.6 \
libxcb-shm.so.0 \
libxcb.so.1 \
libz.so.1 \
mozilla-nspr \
mozilla-nss \
textutils"

inherit rpm
