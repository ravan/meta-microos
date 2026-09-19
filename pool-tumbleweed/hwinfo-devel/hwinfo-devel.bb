SUMMARY = "Headers for the Hardware Detection Library"
DESCRIPTION = "This library collects information about the hardware installed on a \
system."
LICENSE = "GPL-2.0-or-later"

PV = "25.5"

RPM_NAME = "hwinfo-devel-25.5-1.1.aarch64.rpm"
RPM_HASH = "6e986e19fe65de045d6a59c10a4e51f7cbc76ac3737bad05088951b313ac9b138ffb35ffab5ccf91516f98ef6401059daa7446849ec93c9bbf5161c9efab6743"

RPROVIDES:${PN} += "hwinfo-devel \
libhddev \
pkgconfig-hwinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat-devel \
libhd25 \
perl-XML-Parser \
perl-XML-Writer \
udev \
wireless-tools"

inherit rpm
