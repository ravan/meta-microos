SUMMARY = "Qt 5 translations"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
This package contains translations for Qt5 toolkit and it's applications."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qttranslations-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "f5ddbeca5772d8d9ffc9b02463d0ab15326a816f2cf99ed13f0b2862e2f495789c1252568a62fad7906ef40743ab54e10601adf15817863e2a438b45682d6ba3"

RPROVIDES:${PN} += "libqt5-qttranslations"

RDEPENDS:${PN} += ""

inherit rpm
