SUMMARY = "OWASP ModSecurity Common Rule Set (CRS)"
DESCRIPTION = "The OWASP ModSecurity Core Rule Set (CRS) is a set of generic attack detection rules for use with ModSecurity \
or compatible web application firewalls. The CRS aims to protect web applications from a wide range of attacks, \
including the OWASP Top Ten, with a minimum of false alerts."
LICENSE = "Apache-2.0"

PV = "4.29.0"

RPM_NAME = "owasp-modsecurity-crs-4.29.0-1.1.noarch.rpm"
RPM_HASH = "dd0b2cd160fb350819201e86e3087434e9c9e0075a24bc9a3a6382a7057e7ceaf0543b8119bf1da9224e118bdfb170f5b8d163df405c06db66af8931ef495bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "owasp-modsecurity-crs"

RDEPENDS:${PN} += ""

inherit rpm
