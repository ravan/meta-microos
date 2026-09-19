SUMMARY = "Low-latency internet connection tool for real-time jam sessions"
DESCRIPTION = "The Jamulus software enables musicians to perform real-time jam sessions over \
the internet. There is one server running the Jamulus server software which \
collects the audio data from each Jamulus client software, mixes the audio data \
and sends the mix back to each client."
LICENSE = "AGPL-3.0-or-later"

PV = "3.12.5"

RPM_NAME = "Jamulus-3.12.5-1.1.aarch64.rpm"
RPM_HASH = "7fef4619e07138c3e027b05cf99588788c83ff0f3ef693a44332c1907167d493a96013603d8f7d9d450d60b48e2db503ffb6b789c35882ba8d729d85f75b6d11"

RPROVIDES:${PN} += "Jamulus \
jamulus \
llcon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-nogroup \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libstdc++.so.6 \
shadow \
systemd"

inherit rpm
