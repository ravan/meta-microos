SUMMARY = "Compatibility metapackage for X.Org input drivers"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
X.Org input drivers."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-driver-input-7.6_1-16.7.noarch.rpm"
RPM_HASH = "0bd528a9b615b42e6034f162909b431bab2fed97bdfd2a55948d7199ab08fd968a85dc63a710fe724f18d010fb6befe81a3d9adbb3aa76b4b95edd717fb36993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-driver-input \
xorg-x11-driver-input-devel"

RDEPENDS:${PN} += "xf86-input-evdev \
xf86-input-libinput \
xf86-input-void \
xf86-input-wacom"

inherit rpm
