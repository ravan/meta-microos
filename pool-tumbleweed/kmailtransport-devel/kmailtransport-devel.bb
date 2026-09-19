SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kmailtransport-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2a1458fbb98c47ed815367e15b3d6d4aaa32be879a91554075077a214166acabebaa29679315bc73b340039df7d42d8f554870fbba904e02efe1f7cecc6eb14f"

RPROVIDES:${PN} += "cmake-KPim6MailTransport \
kmailtransport-devel"

RDEPENDS:${PN} += "cmake-KF6Config \
cyrus-sasl-devel \
libKPim6MailTransport6"

inherit rpm
