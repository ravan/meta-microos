SUMMARY = "Qt KMSSupport module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-kmssupport-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "d874f635349eb4393daf569c5caa11b6cb8f1b629a54ca8728e48b95db91db3d18ec624b30ba2acc3e4e01775616a0e5a6bd39ca5f7855d43dec7f1b5cc4030b"

RPROVIDES:${PN} += "cmake-Qt6KmsSupportPrivate \
qt6-kmssupport-devel-static"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate"

inherit rpm
