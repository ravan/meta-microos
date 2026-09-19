SUMMARY = "Mouse Event to Key Event Mapper Daemon"
DESCRIPTION = "A daemon for X11, which watches for mouse wheel actions and outputs them as \
keypresses. It can be configured separately for different windows. It also \
allows input from it's own (included) gpm, or from jamd, or from XFree86 ZAxis \
mouse wheel conversion."
LICENSE = "GPL-2.0+"

PV = "1.0.0pre12"

RPM_NAME = "imwheel-1.0.0pre12-7.9.aarch64.rpm"
RPM_HASH = "0c1716662f6ee56d1dbbebb45ad96ded18bbca6041957093813c8c6146baa78e7ff06c8ef412fe41beb816136501f1319c0e9921c5a238e8ed5d37ab4a108122"

RPROVIDES:${PN} += "config-imwheel \
imwheel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
