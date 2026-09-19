SUMMARY = "Qt 6 3D unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages that do not \
have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3d-private-devel-6.11.2-1.1.noarch.rpm"
RPM_HASH = "0d3e1769404431839a233915fabd825d9f9ab0cca1d3bde5c81977d8869e91991fe6c78e217c17e6b4ac57578930763ed03f469c25e434db1399a0378fc63c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-3d-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DAnimationPrivate \
cmake-Qt63DCorePrivate \
cmake-Qt63DExtrasPrivate \
cmake-Qt63DInputPrivate \
cmake-Qt63DLogicPrivate \
cmake-Qt63DQuickAnimationPrivate \
cmake-Qt63DQuickExtrasPrivate \
cmake-Qt63DQuickInputPrivate \
cmake-Qt63DQuickLogic \
cmake-Qt63DQuickPrivate \
cmake-Qt63DQuickRenderPrivate \
cmake-Qt63DQuickScene2DPrivate \
cmake-Qt63DQuickScene3DPrivate \
cmake-Qt63DRenderPrivate \
qt6-3d-devel"

inherit rpm
