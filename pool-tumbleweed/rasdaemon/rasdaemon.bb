SUMMARY = "Utility to receive RAS error tracings"
DESCRIPTION = "rasdaemon is a RAS (Reliability, Availability and Serviceability) logging tool. \
It currently records memory errors, using the EDAC tracing events. \
EDAC is drivers in the Linux kernel that handle detection of ECC errors \
from memory controllers for most chipsets on i386 and x86_64 architectures. \
EDAC drivers for other architectures like arm also exists. \
This userspace component consists of an init script which makes sure \
EDAC drivers and DIMM labels are loaded at system startup, as well as \
an utility for reporting current error counts from the EDAC sysfs files."
LICENSE = "GPL-2.0-only"

PV = "0.8.5+git10.4aec37b"

RPM_NAME = "rasdaemon-0.8.5+git10.4aec37b-1.1.aarch64.rpm"
RPM_HASH = "4a6f0b4272a2dd8ec0fa6fe98d53dcad735e0d546fe35836bb117ce9974ceac15ba092f6137554fc600723d45e9be1c2987974df03e5cd34aeacde6ec4806636"

RPROVIDES:${PN} += "rasdaemon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpci.so.3 \
libsqlite3.so.0 \
libtraceevent.so.1 \
perl-DBD-SQLite"

inherit rpm
