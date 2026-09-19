SUMMARY = "A lightweight text editor written in Lua"
DESCRIPTION = "Lite XL is derived from lite. \
It is a lightweight text editor written mostly in Lua. \
It aims to provide something practical, pretty, small and fast easy to modify \
and extend, or to use without doing either. The aim of Lite XL compared to \
lite is to be more user friendly, improve the quality of font rendering, and \
reduce CPU usage."
LICENSE = "MIT"

PV = "2.1.8"

RPM_NAME = "lite-xl-2.1.8-1.6.aarch64.rpm"
RPM_HASH = "d49cdc80b592bae8694932d7098d12d2a05bd55167b488704312aab59b42294146c4387c8874d144c16bb495cac62492c0746cd81ed05845b579980aa29f1113"

RPROVIDES:${PN} += "lite-xl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6 \
libfreetype.so.6 \
liblua5.4.so.5 \
libm.so.6 \
libpcre2-8.so.0 \
lite-xl-plugin-manager"

inherit rpm
