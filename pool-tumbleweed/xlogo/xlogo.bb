SUMMARY = "X Window System logo"
DESCRIPTION = "The xlogo program simply displays the X Window System logo."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "xlogo-1.0.7-1.8.aarch64.rpm"
RPM_HASH = "789aa8b7a547be3452752d1c19b5c8c9ad93a7b733ed5c7e512ffa8668f63e0361651061f9370fd189f2b69a7d4c917b0c4c3490c40c9d58e00754d745ed1210"

RPROVIDES:${PN} += "xlogo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSM.so.6 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXft.so.2 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6"

inherit rpm
