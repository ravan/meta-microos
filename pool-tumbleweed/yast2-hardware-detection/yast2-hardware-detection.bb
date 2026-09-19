SUMMARY = "YaST2 - Hardware Detection Interface"
DESCRIPTION = "This package contains the hardware detection library for YaST2."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "yast2-hardware-detection-5.0.0-1.13.aarch64.rpm"
RPM_HASH = "31c2b6871133a94f3958bc203e5c48cb5290e206c973be3ae1c5ec31c784a4e72e803138bb7bd78daed64fa893ddba718c2941a1a8ed729accf0024cb01e23c7"

RPROVIDES:${PN} += "libpy2ag-hwprobe.so.2 \
yast2-hardware-detection"

RDEPENDS:${PN} += "hwinfo \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhd.so.25 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
libycp.so.5 \
yast2-ruby-bindings"

inherit rpm
