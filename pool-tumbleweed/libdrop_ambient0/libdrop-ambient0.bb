SUMMARY = "Library for dropping ambient capabilities"
DESCRIPTION = "This library can be used via LD_PRELOAD to force an application started with ambient capabilities to drop them. \
It leaves other capabilities intact. This can also be linked against and automatically does the right thing. \
You do not need to make any calls into the library because all the work is done in the constructor which runs before main() is called."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.5"

RPM_NAME = "libdrop_ambient0-0.8.5-1.10.aarch64.rpm"
RPM_HASH = "8dc66b4edb2d3b4d887837606a37966708bd6af861bd9e982539a950fee9111cafc128f489755f36622a7f135d5cdc3b7e0497f6db4f2cf40e8c4860c4e28ab1"

RPROVIDES:${PN} += "libdrop-ambient.so.0 \
libdrop-ambient0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcap-ng0"

inherit rpm
