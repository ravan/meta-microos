SUMMARY = "Development tools for programs which uses QwtPlot3D Widget set"
DESCRIPTION = "QwtPlot3D is a feature-rich Qt/OpenGL-based C++ programming library. \
It provides essentially a bunch of 3D widgets for programmers."
LICENSE = "Zlib"

PV = "0.2.7+git20190410.a6d0890d"

RPM_NAME = "qwtplot3d-devel-0.2.7+git20190410.a6d0890d-2.9.aarch64.rpm"
RPM_HASH = "ed5e3c397d648e380db7ba4b3d18e29bff3991fea627f1f19408ae6de111449ad895a9218a790b23f0fcba7f6e28c637240171cc5bd0e9c114058b13c161524d"

RPROVIDES:${PN} += "qwtplot3d-devel"

RDEPENDS:${PN} += "libqwtplot3d-qt5-0"

inherit rpm
