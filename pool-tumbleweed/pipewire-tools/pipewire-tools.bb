SUMMARY = "The PipeWire Tools"
DESCRIPTION = "This package contains command line utilities for the PipeWire media server."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-tools-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "57372fa602cef581589bd970c1b475ab619a1025bcca57feb162c53f1ba1e2f2104707bec3585250e0f741ca00d7fdfe8447288572546237f8a6ebfaba56f681"

RPROVIDES:${PN} += "pipewire-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libm.so.6 \
libncursesw.so.6 \
libpipewire-0.3.so.0 \
libreadline.so.8 \
libsndfile.so.1 \
libtinfo.so.6"

inherit rpm
