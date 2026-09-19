SUMMARY = "A collection of add-ons for the CMake build tool"
DESCRIPTION = "A collection of add-ons for the CMake build tool."
LICENSE = "GPL-3.0-or-later"

PV = "1.10"

RPM_NAME = "cmake-extras-1.10-1.3.noarch.rpm"
RPM_HASH = "ccaadb6d340742c384d979208b16f84272946d3fc70e6d461952d8411841b36e5b48b597a1500ff3d1e15877a96a0d2e0a3480436c0fc3d66c0ef01dcd26fabf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-CopyrightTest \
cmake-CoverageReport \
cmake-DoxygenBuilder \
cmake-FormatCode \
cmake-GDbus \
cmake-GMock \
cmake-GObjectIntrospection \
cmake-GSettings \
cmake-GdbusCodegen \
cmake-IncludeChecker \
cmake-Intltool \
cmake-Lcov \
cmake-QmlPlugins \
cmake-Vala \
cmake-extras \
cmake-gcovr"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
clang \
cmake \
doxygen \
gcovr \
gettext \
gmock \
intltool \
lcov \
llvm-gold \
pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-introspection-1.0 \
qmlpluginexports-qt5 \
vala"

inherit rpm
