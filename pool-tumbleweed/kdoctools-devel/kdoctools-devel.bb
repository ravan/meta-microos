SUMMARY = "Build environment for kdoctools"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files. \
Development files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.116.0"

RPM_NAME = "kdoctools-devel-5.116.0-1.12.aarch64.rpm"
RPM_HASH = "d044fa65d4ed0fd19f0440b72e62b5611067d14faa6dc7e8f8b09bf2c146fb7d46bfd39fe60a054b9624fd018285a09cac289151767372ef8a97ed45bef1c81e"

RPROVIDES:${PN} += "cmake-KF5DocTools \
kdoctools-devel \
kdoctools-devel-static"

RDEPENDS:${PN} += "cmake-Qt5Core \
docbook-xsl-stylesheets \
kdoctools \
libKF5DocTools5 \
libxslt-devel"

inherit rpm
