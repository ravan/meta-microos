SUMMARY = "Mozilla Firefox ESR Web Browser"
DESCRIPTION = "Mozilla Firefox is a standalone web browser, designed for standards \
compliance and performance.  Its functionality can be enhanced via a \
plethora of extensions."
LICENSE = "MPL-2.0"

PV = "153.2.0"

RPM_NAME = "firefox-esr-153.2.0-1.1.aarch64.rpm"
RPM_HASH = "e5f8d037ebfae7c16cb33ddd53a3b2eb3eb32284497d80fec3424216e9b4c27cbd6dc327f57708670f584ad435538b9aabe286e1addfd97bc31adb8389b409ff"

RPROVIDES:${PN} += "appdata- \
appdata-firefox.appdata.xml \
firefox-esr \
web-browser"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
desktop-file-utils \
firefox-esr-branding \
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
libproxy.so.1 \
libsmime3.so \
libssl3.so \
libstdc++.so.6 \
libxcb-shm.so.0 \
libxcb.so.1 \
libz.so.1 \
mozilla-nspr \
mozilla-nss \
shared-mime-info \
xdg-desktop-portal"

inherit rpm
