SUMMARY = "An implementation of VNC"
DESCRIPTION = "TigerVNC is an implementation of VNC (Virtual Network Computing), a \
client/server application that allows users to launch and interact \
with graphical applications on remote machines. TigerVNC is capable \
of running 3D and video applications. TigerVNC also provides \
extensions for advanced authentication methods and TLS encryption."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.16.1"

RPM_NAME = "tigervnc-1.16.1-3.1.aarch64.rpm"
RPM_HASH = "9239d05657df5e1184bf27797d2b9088e62f47bbc1f45276b68cd52eccba675b2292aa8a6a1f64ad474e59108d1861107d58bbc154e3521b3d132f3c35431f90"

RPROVIDES:${PN} += "tigervnc \
tightvnc \
vnc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libhogweed.so.6 \
libjpeg.so.8 \
libm.so.6 \
libnettle.so.8 \
libpixman-1.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
