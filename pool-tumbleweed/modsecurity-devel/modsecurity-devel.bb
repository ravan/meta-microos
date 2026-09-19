SUMMARY = "Development files for modsecurity, a web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control. \
 \
This subpackage holds the development headers for the library."
LICENSE = "Apache-2.0"

PV = "3.0.15"

RPM_NAME = "modsecurity-devel-3.0.15-2.3.aarch64.rpm"
RPM_HASH = "9751f8c7d4f5260ba7e16bf05af79628d67dc3346b7e5b9789d71b9fa079eba576ba8a2d25ee815852148776f11fda059563e293c8f23d38834f5be5c2fa8551"

RPROVIDES:${PN} += "modsecurity-devel \
pkgconfig-modsecurity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodsecurity3"

inherit rpm
