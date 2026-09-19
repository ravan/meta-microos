SUMMARY = "Replays VNC macros"
DESCRIPTION = "rfbplaymacro replays VNC macros as created by rfbproxy to a VNC server."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "rfbplaymacro-0.2.2-52.7.aarch64.rpm"
RPM_HASH = "623c371bcad4bb90a2a92931a7df1c8a9e2760c8b3408dfc7934f67220f1f0c39e6659d825a5556aef9f61614706178b131d4313da02df9b0e039005b5df7306"

RPROVIDES:${PN} += "rfbplaymacro"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
