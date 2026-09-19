SUMMARY = "SGML and XML DTDs for the W3C Markup Validator"
DESCRIPTION = "SGML and XML DTDs for the W3C Markup Validator."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "w3c-markup-validator-libs-1.3-12.7.noarch.rpm"
RPM_HASH = "3847ebb5ad3eb5eea408eb323ccf6aa0c7ad39da85c4b7cb3e0190d95ae27f849d8ba061bb8fa827d6735b89c6df6c667787ef783840ec095df32fcf456964ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-w3c-markup-validator-libs \
w3c-markup-validator-libs"

RDEPENDS:${PN} += "/usr/bin/sh \
sgml-skel"

inherit rpm
