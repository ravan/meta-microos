SUMMARY = "Open Source remake of 'One Must Fall 2097'"
DESCRIPTION = "OpenOMF is a open source remake of 'One Must Fall 2097'. \
 \
OMF is a fighting game featuring two robot fighters who fight in a \
single arena. Eleven robots and ten customizable pilots are available \
for play, along with five arenas and four tournaments. The pilots \
vary in strength, speed and endurance. \
 \
NOTE: \
To play One Must Fall 2097 with openomf you need the original game \
files.  See /usr/share/doc/packages/openomf/README.SUSE"
LICENSE = "MIT"

PV = "0.8.5"

RPM_NAME = "openomf-0.8.5-2.1.aarch64.rpm"
RPM_HASH = "04b2bfaa72b583014d9c877b0fb74fbdd21be42da460acbb31b99cf94ea45e56256d77f03383eb5497202e7ac947f3e8920289b7de0c49c910060749a0bb7703"

RPROVIDES:${PN} += "openomf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libconfuse.so.2 \
libenet.so.7 \
libepoxy.so.0 \
libm.so.6 \
libopusfile.so.0 \
libpng16.so.16 \
libxmp.so.4"

inherit rpm
