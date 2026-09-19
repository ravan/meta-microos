SUMMARY = "Development files for libkdsingleapplication-qt6"
DESCRIPTION = "Development files for libkdsingleapplication-qt6."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "kdsingleapplication-qt6-devel-1.2.1-2.1.aarch64.rpm"
RPM_HASH = "e441f6a6881ad3ad85ef4ec20aebcb6b8551a34db6cdcd28a3ed0f8a2b709ecaaa13de11b09cac1e79c7211a8fff3576819bb7cbccdfc05da47fb7948ad31154"

RPROVIDES:${PN} += "cmake-KDSingleApplication-qt6 \
kdsingleapplication-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
cmake-Qt6Widgets \
libkdsingleapplication-qt6-1-2"

inherit rpm
