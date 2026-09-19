SUMMARY = "Qt KMS support module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5KmsSupport-devel-static-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "bb7625c2bd9b859a44a5089d2b3523709f66ad4446ce8bd3ecab39b8a2af857a6203944ada14d28ceaed7e969cf13c864de6915a1cf6c3c6a18cad2b7a554ee9"

RPROVIDES:${PN} += "cmake-Qt5KmsSupport \
libQt5KmsSupport-devel-static"

RDEPENDS:${PN} += "libQt5Core-devel \
libQt5Gui-devel"

inherit rpm
