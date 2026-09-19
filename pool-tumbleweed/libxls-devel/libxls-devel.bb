SUMMARY = "Header files for libxls"
DESCRIPTION = "Development files for libxls."
LICENSE = "BSD-2-Clause"

PV = "1.6.3"

RPM_NAME = "libxls-devel-1.6.3-1.7.aarch64.rpm"
RPM_HASH = "09137fd7b7f7a81fdeadce79a3e4efe4a9d2bfe62a30dc0376497bb52f1335e2479bc6d1c594cbc5dc0ab6a4ae5e1e4f8976c29721c268d762a6fbcb948dadc6"

RPROVIDES:${PN} += "libxls-devel \
pkgconfig-libxls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxlsreader8"

inherit rpm
