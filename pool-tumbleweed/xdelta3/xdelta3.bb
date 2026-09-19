SUMMARY = "A diff utility which works with binary files"
DESCRIPTION = "Xdelta3 is a set of tools designed to compute changes between \
binary files.  These changes (delta files) are similar to the output of the \
'diff' program, in that they may be used to store and transmit only the \
changes between files.  The 'delta files' that Xdelta3 manages are \
stored in RFC3284 (VCDIFF) format."
LICENSE = "Apache-2.0 & GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "xdelta3-3.1.0-6.5.aarch64.rpm"
RPM_HASH = "df0b34c2a2914c2f2d500a0f66c3e04f371662f08a3e380fb62ed2ed146859bac7d6f27843211a87ffecf9899ff615861cb57099cd4878a940dc224d0a7af3be"

RPROVIDES:${PN} += "xdelta \
xdelta3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libm.so.6"

inherit rpm
