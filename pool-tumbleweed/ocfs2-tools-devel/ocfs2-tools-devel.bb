SUMMARY = "Oracle Cluster File System 2 Development files"
DESCRIPTION = "OCFS2 is the Oracle Cluster File System. \
 \
This package contains the header files for developing low-level \
OCFS2-aware applications."
LICENSE = "GPL-2.0-only"

PV = "1.8.8"

RPM_NAME = "ocfs2-tools-devel-1.8.8-8.6.aarch64.rpm"
RPM_HASH = "ecda4c02e835f7114d0e1f20a4085d20dad271d8c8df4d51728175ed7fc88f462d447fea6b0297225292d22114f23ed262ef2d54b616b16381f6bb34ebf83067"

RPROVIDES:${PN} += "ocfs2-tools-devel \
pkgconfig-o2cb \
pkgconfig-o2dlm \
pkgconfig-ocfs2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcom-err \
libcom-err-devel \
ocfs2-tools \
pkgconfig-com-err \
pkgconfig-o2cb \
pkgconfig-o2dlm"

inherit rpm
