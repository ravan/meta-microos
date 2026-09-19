SUMMARY = "Compatibility metapackage for X.Org video drivers"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
X.Org video drivers."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-driver-video-7.6_1-20.6.aarch64.rpm"
RPM_HASH = "fce05aeeba924525b78918b59dc95946a32498447d8e8c48c493e943d29f1e659d40475d81bca2f692e07b6eb25c50c92350478c255cbec6d0e466c588922734"

RPROVIDES:${PN} += "xorg-x11-driver-video \
xorg-x11-driver-video-radeonhd \
xorg-x11-driver-video-unichrome"

RDEPENDS:${PN} += "xorg-x11-server"

inherit rpm
