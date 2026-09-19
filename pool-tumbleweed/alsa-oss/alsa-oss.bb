SUMMARY = "LD_PRELOAD-able library that translates OSS into ALSA calls"
DESCRIPTION = "A preloadable library that intercepts Open Sound System API calls \
in applications and translates them into ALSA API calls. \
A convenience script to launch such applications with the preloaded \
library is provided as well, called 'aoss'."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.8"

RPM_NAME = "alsa-oss-1.1.8-5.13.aarch64.rpm"
RPM_HASH = "7277c54ae520802821b744fe3e79ecde3ef2615c6a63e2e195f3f812ac1af4abfa2e83d055b5a9045ff48859b9e1319cf1c2901c6020c84c9f5b11672b4da435"

RPROVIDES:${PN} += "alsa-oss \
libalsatoss.so.0 \
libaoss.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
