SUMMARY = "PKCS #11 API PAM Documentation"
DESCRIPTION = "API documentation for pam_pkcs11 \
 \
This Linux PAM module allows X.509 a certificate-based user \
authentication."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.13"

RPM_NAME = "pam_pkcs11-devel-doc-0.6.13-3.3.noarch.rpm"
RPM_HASH = "140c072dbbf5d6b902bd4ebffec81363fc4a2239aad0c77ddf545236e3e2022d1d5810530d3b01327f7ae1e0d34a603c179ac15c688fe7aad1fd36ddc0fc1b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-pkcs11-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
