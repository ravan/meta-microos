SUMMARY = "Oracle Cluster File System 2 static libraries"
DESCRIPTION = "OCFS2 is the Oracle Cluster File System. \
 \
This package contains the static libraries for developing low-level \
OCFS2-aware applications."
LICENSE = "GPL-2.0-only"

PV = "1.8.8"

RPM_NAME = "ocfs2-tools-devel-static-1.8.8-8.6.aarch64.rpm"
RPM_HASH = "93081ca870187e7126265f85b87d79fafd8e5c843485cad65b5da64b08d83e374e7c37eaafb69b76ea6172f903483328752f18f00ad28faf977521ba766e26bf"

RPROVIDES:${PN} += "ocfs2-tools-devel-static"

RDEPENDS:${PN} += "libcom-err \
libcom-err-devel \
ocfs2-tools"

inherit rpm
