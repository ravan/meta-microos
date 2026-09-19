SUMMARY = "Headers for the unstable API of the Qt5 Quick 3D module"
DESCRIPTION = "You need this package if you want to compile programs against the unstable API \
of the Qt5 Quick 3D module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde1"

RPM_NAME = "libqt5-qtquick3d-private-headers-devel-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "9b4a3e3e03e4795ecbf4501fe229ff6460272eb396c74292d38d66b167bff982ec0cb4c6d395e9e9b4dff3e0841f512cc797941bb503d2b166ee35bbd52ef758"

RPROVIDES:${PN} += "libqt5-qtquick3d-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtquick3d-devel"

inherit rpm
