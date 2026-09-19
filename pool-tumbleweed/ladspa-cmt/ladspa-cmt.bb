SUMMARY = "LADSPA CMT plugins"
DESCRIPTION = "This toolkit is a set of musical sound processing and synthesis tools \
presented as a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin library for CMT (Computer Music Toolkit). \
See the /usr/share/doc/packages/ladspa-cmt directory for documentation."
LICENSE = "GPL-2.0-or-later"

PV = "1.18"

RPM_NAME = "ladspa-cmt-1.18-1.20.aarch64.rpm"
RPM_HASH = "0864c2868a302c01479420e59ea2b3d0e1c67920cf2a27e69054dd09f3503ef5867cd3f341b9f10a7b5c01db7afca29dd1853771fa7d667aca06f3f81583a229"

RPROVIDES:${PN} += "ladspa-cmt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
