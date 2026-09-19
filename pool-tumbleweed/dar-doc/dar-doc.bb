SUMMARY = "Documentation for dar"
DESCRIPTION = "Documentation package for dar"
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.6"

RPM_NAME = "dar-doc-2.8.6-1.1.noarch.rpm"
RPM_HASH = "a01ee2a824c74220810b90d63c640cb7359efca087acd10750a34fc90f04c56e2a8742bfe3a540817b3a8772bbf81c3458ffe19a390805a54907c29d8ce318da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dar-doc"

RDEPENDS:${PN} += ""

inherit rpm
