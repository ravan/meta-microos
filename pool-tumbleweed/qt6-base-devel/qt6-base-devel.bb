SUMMARY = "Qt 6 base development meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-base-devel-6.11.2-2.1.noarch.rpm"
RPM_HASH = "92f9b56c3541c18a1c12e9538ff44dd413984856347c04328a5784c94bf6284d3c447f1a421c8ce4104ba94fd75f0c87cc1cfc7e196671d9ea89e9305174985e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-base-devel"

RDEPENDS:${PN} += "cmake-Qt6Concurrent \
cmake-Qt6Core \
cmake-Qt6DBus \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6OpenGL \
cmake-Qt6OpenGLWidgets \
cmake-Qt6PrintSupport \
cmake-Qt6Sql \
cmake-Qt6Test \
cmake-Qt6WaylandClient \
cmake-Qt6WaylandGlobalPrivate \
cmake-Qt6Widgets \
cmake-Qt6Xml \
qt6-base-common-devel"

inherit rpm
