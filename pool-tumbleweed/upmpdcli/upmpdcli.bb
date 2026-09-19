SUMMARY = "UPnP AV and OpenHome Media Renderer front-end to MPD, the Music Player Daemon"
DESCRIPTION = "Upmpdcli turns MPD, the Music Player Daemon into an UPnP AV and/or OpenHome Media Renderer \
remotely controllable by most UPnP/DLNA/OpenHome Control Point apps (notably on mobile devices). \
It can also operate as an UPnP/DLNA Media Server to give access to various online audio content via plugins available as optional packages."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-1.9.17-1.5.aarch64.rpm"
RPM_HASH = "0f418321d34b55f3e39ee6bc74f47ccedd84b4d3e3111489316f3f5c4d58edad521543e2208bb2afedcbbae15ef255b0b88de327ff15ac196dbcda41963080ff"

RPROVIDES:${PN} += "config-upmpdcli \
upmpdcli"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
group-audio \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
libmicrohttpd.so.12 \
libmpdclient.so.2 \
libstdc++.so.6 \
libupnpp.so.17 \
python3-requests \
shadow"

inherit rpm
