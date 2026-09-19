SUMMARY = "Documentation for qt6-serialport in QCH format"
DESCRIPTION = "This package contains documentation for qt6-serialport in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-serialport-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e7f94d3e5661f72612d65afb7529b53ce82318b0d267493a0e61798041ae34b47684e07a80e8d8579ae84c24023800acf5330347b6b10210e7cbd64a979f7ce2"

RPROVIDES:${PN} += "qt6-serialport-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
