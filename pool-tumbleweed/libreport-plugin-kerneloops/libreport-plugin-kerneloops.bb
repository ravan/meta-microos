SUMMARY = "libreport's kerneloops reporter plugin"
DESCRIPTION = "This package contains plugin which sends kernel crash information to specified \
server, usually to kerneloops.org."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-plugin-kerneloops-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "614e6ed9808432af37fde46a41e3301037ef10a3fff090f04f89568dbe1342fc22ada595e55a1cf3acaf095545faef6aa8844f7fb85190cd0fb5535aa03bc92f"

RPROVIDES:${PN} += "libreport-plugin-kerneloops"

RDEPENDS:${PN} += "curl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libglib-2.0.so.0 \
libreport-2 \
libreport-web-2 \
libreport-web.so.2 \
libreport.so.2"

inherit rpm
