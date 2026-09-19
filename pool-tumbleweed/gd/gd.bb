SUMMARY = "A Drawing Library for Programs That Use PNG and JPEG Output"
DESCRIPTION = "Gd allows your code to quickly draw images complete with lines, arcs, \
text, and multiple colors. It supports cut and paste from other images \
and flood fills. It outputs PNG, JPEG, and WBMP (for wireless devices) \
and is supported by PHP."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "gd-2.3.3-6.1.aarch64.rpm"
RPM_HASH = "68923355c2afc2293650bf52c41ca65bdb33851c55bbb00b1b79030c3627b8d121100637234a4ec2731ffcf4dce3d4c763124b04eaed5f68b173bd1988e26159"

RPROVIDES:${PN} += "gd \
gdlib"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
