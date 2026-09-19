SUMMARY = "Development files for the Qt 6 Core library"
DESCRIPTION = "Development files for the Qt 6 Core library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-core-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "0655142ed1b90325ab04feb894f5812b2bdc2f88f8a43735feaf5fd4e0ace10bb0987425fd6a1b893d52d7d77de8a3d96264e20d30edfb5aa23a48f59a75a5ee"

RPROVIDES:${PN} += "cmake-Qt6Core \
cmake-Qt6CoreTools \
pkgconfig-Qt6Core \
qt6-core-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Core6 \
pkgconfig-Qt6Platform \
qt6-base-common-devel"

inherit rpm
