SUMMARY = "Development files for GnuCash"
DESCRIPTION = "This package provides all the necessary files for development of GnuCash, \
a personal finance manager."
LICENSE = "LicenseRef-SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "5.16"

RPM_NAME = "gnucash-devel-5.16-1.1.noarch.rpm"
RPM_HASH = "5b807a56f78931c898f7daa99a4f28d16b587b7a2a77fea25820b94c32cc3b41bebeb512c569b1d118b119c581a34752850559b6443f446375639d05a81ecf04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnucash-devel"

RDEPENDS:${PN} += "gnucash"

inherit rpm
