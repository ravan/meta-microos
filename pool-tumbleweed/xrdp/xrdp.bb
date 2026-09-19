SUMMARY = "Remote desktop protocol (RDP) server"
DESCRIPTION = "A terminal server, capable of accepting connection from rdesktop and \
Microsoft's own terminal server / remote desktop clients."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.10.6.1"

RPM_NAME = "xrdp-0.10.6.1-1.1.aarch64.rpm"
RPM_HASH = "cebf91f64698a4ba1740eb643085292b120fa59de27bd29020b02fffa719efaa5e17513965038ae225aa33e44fd578a5aa89a64df2ef7afafb90a579450913c9"

RPROVIDES:${PN} += "config-xrdp \
libcommon.so.0 \
libipm.so.0 \
libmc.so \
libsesman.so.0 \
libtoml.so.1 \
libvnc.so \
libxrdp.so.0 \
libxrdpapi.so.0 \
libxup.so \
xrdp"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libc.so.6 \
libcrypto.so.3 \
libfuse3.so.4 \
libpam.so.0 \
libpixman-1.so.0 \
libssl.so.3 \
xorg-x11-Xvnc"

inherit rpm
