SUMMARY = "VNC Development Library"
DESCRIPTION = "VNC is a set of programs using the RFB (Remote Frame Buffer) protocol. \
They are designed to 'export' a frame buffer via the network. It is \
already in wide use for administration, but it is not that easy to \
program a server yourself. This has been changed by LibVNCServer. \
 \
X.org already has a virtual Xvnc server which you can start as an own \
screen (e.g. :1) and connect to with a VNC client (e.g. vncviewer from \
tightvnc). \
 \
The LibVNCServer-devel package contains the static libraries and header \
files for LibVNCServer."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.15"

RPM_NAME = "LibVNCServer-devel-0.9.15-4.1.aarch64.rpm"
RPM_HASH = "d1f70b5607542c44d84df698ea74f44795f1c3cd6c72883c2a22fe1899512b78e2eae73dba3433efb78e61e1cc4d415bec7a2f3056bd8142e7c6954532747d18"

RPROVIDES:${PN} += "LibVNCServer-devel \
cmake-LibVNCServer \
pkgconfig-libvncclient \
pkgconfig-libvncserver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnutls-devel \
libgcrypt-devel \
libgnutls-devel \
libjpeg-devel \
libpng-devel \
libvncclient1 \
libvncserver1 \
lzo-devel \
openssl-devel \
zlib-devel"

inherit rpm
