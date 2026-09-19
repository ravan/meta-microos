SUMMARY = "High-performance QuakeSpasm fork"
DESCRIPTION = "A fork of the popular GLQuake descendant QuakeSpasm with a focus \
on high performance instead of maximum compatibility, \
with a few extra features sprinkled on top. \
Quake game files (id1 directory containing pak files) must be found \
for ironquake to start: \
- automatically found if the Quake Steam remaster is installed \
- id1 directory can be copied into ~/.ironwail \
- start ironwail with option -basedir <install_dir>, where <install_dir> \
  is the directory containing the id1 folder"
LICENSE = "GPL-2.0-or-later"

PV = "0.8.2"

RPM_NAME = "ironwail-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "20b789e42ea5a5a61dfa12c45e5d04f3b6b57f9e1d23436210da6bfb5d883ea3120c659b51ab5c078341215fce272abdee0db2a15587bfc0f9119a31e3e846f5"

RPROVIDES:${PN} += "ironwail"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libm.so.6 \
libmikmod.so.3 \
libmpg123.so.0 \
libopusfile.so.0 \
libvorbisfile.so.3"

inherit rpm
