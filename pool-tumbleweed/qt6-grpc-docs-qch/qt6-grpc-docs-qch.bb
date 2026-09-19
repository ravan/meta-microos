SUMMARY = "Documentation for qt6-grpc in QCH format"
DESCRIPTION = "This package contains documentation for qt6-grpc in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-grpc-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a0b6001de69550a463995beac0df94da3552941949c2340faf48f4bc0f4f4f84c0f6c24404b6b9e3aa88c6764b4419f2aa8db6f8730840fae1840b7aba897e00"

RPROVIDES:${PN} += "qt6-grpc-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
