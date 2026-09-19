SUMMARY = "Mozilla's CA cert bundle in PEM format"
DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate Authority \
certificates in a form that can be consumed by modules and libraries based \
on OpenSSL. \
 \
The module provide a single function: \
 \
* SSL_ca_file() \
 \
Returns the absolute path to the Mozilla's CA cert bundle PEM file."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "20250602.0.0"

RPM_NAME = "perl-Mozilla-CA-20250602.0.0-1.7.noarch.rpm"
RPM_HASH = "f04e5aaeaf5affeca88fab29c29ab33ec9ee0fd82a9dbd123d3453d8b7ab08e1135565fbf160b405ad75ef065077cbcce2a2f28e89b16697b1191550e58b1ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mozilla--CA \
perl-Mozilla-CA"

RDEPENDS:${PN} += "ca-certificates-mozilla \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
