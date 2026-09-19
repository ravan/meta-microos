SUMMARY = "Build environment for kdoctools"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files. \
Development files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "6.30.0"

RPM_NAME = "kf6-kdoctools-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f768d3722907ca1727d9b01bfaeba99759b8e1962518fcfd47e7dc589263ca68004c10c4569c9aa7cd9a536421a9472ad4c4cc7e8f7a64f0f3564604a00c9b2a"

RPROVIDES:${PN} += "cmake-KF6DocTools \
kf6-kdoctools-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
docbook-xsl-stylesheets \
kf6-extra-cmake-modules \
libKF6DocTools6 \
libxslt-devel"

inherit rpm
