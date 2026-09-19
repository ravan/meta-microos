SUMMARY = "Audio and Video processing media library"
DESCRIPTION = "Librem is a generic library for real-time audio \
and video processing. \
 \
Features: \
 * Audio buffering, mixing, codecs and resampling \
 * Video mixing, rescaling and pixel format conversion"
LICENSE = "BSD-3-Clause"

PV = "2.12.0"

RPM_NAME = "librem6-2.12.0-1.20.aarch64.rpm"
RPM_HASH = "4203a39bf43eb772b255a590e7613df6791fda4bc928019ce2ccc79351fff1161b97d0b34010b6974e8534787cf8b1d46ef73816cc8f640a147de50173939cf4"

RPROVIDES:${PN} += "librem.so.6 \
librem6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libre.so.45"

inherit rpm
