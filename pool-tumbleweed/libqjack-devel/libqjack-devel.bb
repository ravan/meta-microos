SUMMARY = "Connect to the Jack Sound Server with Qt"
DESCRIPTION = "QJack makes you connect with the Jack soundserver system with Qt."
LICENSE = "GPL-2.0-or-later"

PV = "0.0+20170112"

RPM_NAME = "libqjack-devel-0.0+20170112-5.6.aarch64.rpm"
RPM_HASH = "44db3e01b4352a0dffd6d97472628ddd721b22de3508f58588a2d7b568d7d3fc8732930b61fbbd93646ae815a99cc0ef689a468b1af2f5d9bfa1590d71dc6522"

RPROVIDES:${PN} += "libqjack-devel"

RDEPENDS:${PN} += "jack-devel \
libqjack0 \
pkgconfig-Qt5Core"

inherit rpm
