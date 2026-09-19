SUMMARY = "Documentation for qt6-declarative in QCH format"
DESCRIPTION = "This package contains documentation for qt6-declarative in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-declarative-docs-qch-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "e7f99e9a1436f030ea4099139c1e395e4a535bef142e8e28735dfcc3e1c7185e2100444a26a429929caec71679d506694ec4b8fd92c44d879bae524c8dbec649"

RPROVIDES:${PN} += "qt6-declarative-docs-qch \
qt6-quickcontrols2-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
