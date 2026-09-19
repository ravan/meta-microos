SUMMARY = "Empty package to ensure rebuilding usbip in OBS"
DESCRIPTION = "This is an empty package that ensures usbip is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-or-later"

PV = "7.2.5"

RPM_NAME = "usbip-rebuild-7.2.5-1.39.aarch64.rpm"
RPM_HASH = "158b4ace00dc8fc9db8b4946b04913a0865d3bf782b3d5d5fea7cf33c832feaadc841851e5a7922da54137058b15acda87af86e5566688ea6903b94bce41fd2a"

RPROVIDES:${PN} += "usbip-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
