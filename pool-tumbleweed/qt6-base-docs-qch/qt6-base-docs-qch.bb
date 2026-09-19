SUMMARY = "Documentation for qt6-base in QCH format"
DESCRIPTION = "This package contains documentation for qt6-base in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-base-docs-qch-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "83ffc30ac538bb9a40c717e7124e53da2f2977c841ee4b07f76f7e673e2a078253f91ffc91299d7b909d78cfeb594dfcc264a464a0c96044a6883670f2d5c5d5"

RPROVIDES:${PN} += "qt6-base-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
