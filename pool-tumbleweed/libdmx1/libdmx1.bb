SUMMARY = "Distributed Multihead X extension library"
DESCRIPTION = "libdmx is an interface to the DMX extension for X, which allows a \
single server to be set up as a proxy spanning multiple servers -- \
not unlike Xinerama across discrete physical machines. It can be \
reconfigured on the fly to change the layout, and it is presented as \
a single logical display to clients. \
 \
libdmx allows clients to configure the layout of DMX servers by \
adding and removing screens, input devices, et al."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libdmx1-1.1.5-1.11.aarch64.rpm"
RPM_HASH = "9b88310df6ae3c94f8a42bf5d68c3e9ffc981f4aa60334d203db5aecfe3d777a71eee1d8e297fa9270eae42bbe1ffa5e1e74cf5471c1c84d8ced91e20912d515"

RPROVIDES:${PN} += "libdmx.so.1 \
libdmx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
