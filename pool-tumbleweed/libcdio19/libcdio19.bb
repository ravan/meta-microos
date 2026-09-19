SUMMARY = "CD-ROM Access Library"
DESCRIPTION = "The libcdio package contains libraries for CD-ROM and CD image \
access. Applications can use them as an abstraction to OS- and \
device-dependent properties of a CD-ROM or of the specific details of \
various CD image formats. \
 \
This subpackage contains the C API library from cdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "libcdio19-2.2.0-1.7.aarch64.rpm"
RPM_HASH = "b3894582212445d07b65ff7a5dd4bc1e4dc1a4f8bab8a7a0df357ff9b49dbf376b883f1c8354b27855be532c8ee88142f75e6c80fecf268641b5d3e6837b5559"

RPROVIDES:${PN} += "libcdio.so.19 \
libcdio19"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
