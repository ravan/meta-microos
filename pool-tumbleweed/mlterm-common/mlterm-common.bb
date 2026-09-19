SUMMARY = "Multilingual Terminal Emulator common files"
DESCRIPTION = "Common files for Mlterm multilingual terminal emulator"
LICENSE = "BSD-3-Clause"

PV = "3.9.5"

RPM_NAME = "mlterm-common-3.9.5-1.1.aarch64.rpm"
RPM_HASH = "c61ec2c26985a2c4707f5973ff167fdf09eba243317bb9a44f2f59eb4201d687927547c78dfcb50b7b61e027366d5340093aff7db4d4c9f66841a2a71c5670be"

RPROVIDES:${PN} += "libctl-bidi.so \
libctl-iscii.so \
libind-assamese.so \
libind-bengali.so \
libind-gujarati.so \
libind-hindi.so \
libind-iitkeyb.so \
libind-inscript.so \
libind-kannada.so \
libind-malayalam.so \
libind-oriya.so \
libind-punjabi.so \
libind-telugu.so \
libmef-8bits.so \
libmef-jajp.so \
libmef-kokr.so \
libmef-zh.so \
libmef.so.4 \
libmlterm-coreotl.so \
libotl.so \
libpobl.so.3 \
libptyssh.so \
libzmodem.so \
mlterm-common"

RDEPENDS:${PN} += "/sbin/ldconfig \
group-tty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfribidi.so.0 \
libharfbuzz.so.0 \
libssh2.so.1"

inherit rpm
