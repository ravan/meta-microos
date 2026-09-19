SUMMARY = "The iSCSI User-level Library Development Library and Include files"
DESCRIPTION = "This development package contains the open-iscsi user-level library \
include files and documentation. These are used to compile against \
the libopeniscsiusr library."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.12"

RPM_NAME = "open-iscsi-devel-2.1.12-113.1.aarch64.rpm"
RPM_HASH = "f1894e07149d0a2cebb736b57c732ae9b10097eae490338cde09543438ff4e2228057ab577c6e8f0539f6084a1082e4f1864bebe093fdbbd8f209fbba496a493"

RPROVIDES:${PN} += "open-iscsi-devel \
pkgconfig-libopeniscsiusr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopeniscsiusr0 \
open-iscsi"

inherit rpm
