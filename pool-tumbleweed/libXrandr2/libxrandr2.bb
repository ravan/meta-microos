SUMMARY = "X Resize, Rotate and Reflection extension library"
DESCRIPTION = "The X Resize, Rotate and Reflect Extension (RandR) allows clients to \
dynamically change X screens, so as to resize, to change the \
orientation and layout of the root window of a screen."
LICENSE = "MIT"

PV = "1.5.5"

RPM_NAME = "libXrandr2-1.5.5-1.4.aarch64.rpm"
RPM_HASH = "685989f398db91ed5bf9d6629535dea000bdbc3e938e97ef1092372e01c1bfbe8960dd78df8c7894ebdebfe75f7611961a7d5adf9fe99a17a37795bb736d9f31"

RPROVIDES:${PN} += "libXrandr.so.2 \
libXrandr2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libc.so.6"

inherit rpm
