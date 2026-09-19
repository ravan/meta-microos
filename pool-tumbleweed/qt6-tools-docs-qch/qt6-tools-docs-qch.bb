SUMMARY = "Documentation for qt6-tools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-tools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-tools-docs-qch-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "ad32ecc3ae808208990c00d633c09ab2d227384c5d0a976969ca01bd6cbdfbd33c035886cd95f53ff427a0e6f46f1a9d8d7c3c2e14a4e54731b7fd6d9b577895"

RPROVIDES:${PN} += "qt6-tools-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
