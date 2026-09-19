SUMMARY = "External scripting package for Yate"
DESCRIPTION = "The yate-scripts package includes libraries for using external scripts with Yate."
LICENSE = "GPL-2.0-only"

PV = "6.4.0"

RPM_NAME = "yate-scripts-6.4.0-6.6.aarch64.rpm"
RPM_HASH = "0e838240f4d42ce7842a25f0e2e2ee6041420dddea2807d921259ffd28f8a521e5da47d4a9b1f47b66cf4219cb7efa84de93661e307a31a7bc686064be933e7a"

RPROVIDES:${PN} += "perl-Yate \
yate-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/php \
/usr/bin/sh \
yate"

inherit rpm
