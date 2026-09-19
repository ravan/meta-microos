SUMMARY = "CLI utility to build and manage a PKI CA"
DESCRIPTION = "easy-rsa is a CLI utility to build and manage a Public Key Infrastructure \
(PKI). Once the Certificate Authority (CA) is created, you can request and sign \
certificates, including sub-CAs, and create Certificate Revokation Lists (CRL)."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "easy-rsa-3.2.6-1.2.noarch.rpm"
RPM_HASH = "fbb4b91a7cb6ebb8e1e61f70a363d6a3ab992b5fb3b33bf0e278d80ff4d0951757a5b9e37156084ed684d4a260ae4d87af4f5eb6c643b414b8ccd8857099f927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-easy-rsa \
easy-rsa"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
