SUMMARY = "OWASP ModSecurity Common Rule Set (CRS)"
DESCRIPTION = "The OWASP ModSecurity Core Rule Set (CRS) Apache2 HTTPD configuration."
LICENSE = "Apache-2.0"

PV = "4.29.0"

RPM_NAME = "owasp-modsecurity-crs-apache2-4.29.0-1.1.noarch.rpm"
RPM_HASH = "2593421f33f4f8dc5eef06a48b1dc4ffe7d08d1ecd5c58ccd817517d1b01a1d332c8a76b323fb89ac026c81ac38e817f84f6170360a9657ca7a22381c20198aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-owasp-modsecurity-crs-apache2 \
owasp-modsecurity-crs-apache2"

RDEPENDS:${PN} += "apache2-mod-security2 \
owasp-modsecurity-crs"

inherit rpm
