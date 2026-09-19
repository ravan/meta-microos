SUMMARY = "Qt 6 base unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-base-private-devel-6.11.2-2.1.noarch.rpm"
RPM_HASH = "97a1d3d1c95068e15a57f465864d63d2017a382c687e3362bd2fd078f27a793c374f44478ee99072d3aeaca5cdfc7ae43c1503fc67838e1b92753629ffc2cebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-base-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6DBusPrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6NetworkPrivate \
cmake-Qt6OpenGLPrivate \
cmake-Qt6PrintSupportPrivate \
cmake-Qt6SqlPrivate \
cmake-Qt6TestPrivate \
cmake-Qt6WaylandClientPrivate \
cmake-Qt6WidgetsPrivate \
cmake-Qt6XmlPrivate \
qt6-base-devel \
qt6-kmssupport-private-devel"

inherit rpm
