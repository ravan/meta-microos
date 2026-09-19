SUMMARY = "Extra plugins for Audacious"
DESCRIPTION = "Extra plugins for the Audacious audio player."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & MIT"

PV = "4.6.1"

RPM_NAME = "audacious-plugins-extra-4.6.1-1.2.aarch64.rpm"
RPM_HASH = "873fed16c14f373f65161b44461163183fecac814347601692ec54e0d4a3e2f7533456f5ef522649ec3a549c0a95b948b7b4e2944b23a06c4ef0787a89fa9a77"

RPROVIDES:${PN} += "audacious-plugins-extra"

RDEPENDS:${PN} += "audacious-plugins \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libaudcore.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libmp3lame.so.0 \
libogg.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
