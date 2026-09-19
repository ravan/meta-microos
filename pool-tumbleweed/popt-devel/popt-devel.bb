SUMMARY = "Development files for the popt library"
DESCRIPTION = "The popt-devel package includes header files and libraries necessary \
for developing programs which use the popt C library. It contains the \
API documentation of the popt library, too."
LICENSE = "MIT"

PV = "1.19"

RPM_NAME = "popt-devel-1.19-2.3.aarch64.rpm"
RPM_HASH = "b260fed0f55178eddc1e2278d5e5badc70b99374fdf9009327b045ba5586b7f1ef0bf27db03fa84f7d0f66df78f4e54aa06ea8fa6e45a3b7364f9c8cf0de9010"

RPROVIDES:${PN} += "pkgconfig-popt \
popt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libpopt0"

inherit rpm
