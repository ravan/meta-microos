SUMMARY = "Documentation for qt6-webchannel in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webchannel in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-webchannel-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "c62ddb985198804115a6b0c4196a72e43e45a7a7df60e79518a6c32c48aa914e969331f11a251f8e94775aec7362e570b838579e92ed0f082548d42b72a97310"

RPROVIDES:${PN} += "qt6-webchannel-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
