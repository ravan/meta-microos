SUMMARY = "Translations for package nomacs"
DESCRIPTION = "Provides translations for the 'nomacs' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.23.3"

RPM_NAME = "nomacs-lang-3.23.3-1.1.noarch.rpm"
RPM_HASH = "154067e4c81c8eb314871d93d853227813e7f9cd7ab560998ff405026756a7ac3084a04ab4f6c425db82b7f370b8aa11250688f1e8aad945b58fbfee9733fcf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nomacs-lang \
nomacs-lang-all"

RDEPENDS:${PN} += "nomacs"

inherit rpm
