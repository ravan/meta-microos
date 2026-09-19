SUMMARY = "Development files for the Qt5 testing library"
DESCRIPTION = "Development files for the Qt5 testing library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Test-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "85139bc64502e4a7ad911ff7c53cb074dc574a2fb36690938787748e25af2e26558a300c8183abe54d65d894152de31fc00c2f8bb858d8cd56a8096077e22e12"

RPROVIDES:${PN} += "cmake-Qt5Test \
libQt5Test-devel \
pkgconfig-Qt5Test"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Test5 \
pkgconfig-Qt5Core"

inherit rpm
