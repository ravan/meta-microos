SUMMARY = "Documentation files for Subversion"
DESCRIPTION = "This package contains the subversion book (see \
http://svnbook.red-bean.com/) and a configuration file to make this \
book accessible via apache2."
LICENSE = "CC-BY-2.0"

PV = "1.8.r5043"

RPM_NAME = "subversion-doc-1.8.r5043-1.26.noarch.rpm"
RPM_HASH = "5f9e6cfb45ef52a5db7bfdcdb43e22568ddb7869349b8f8e2eb832c977b932fc18eb156264e398437cc2abc333f14a765312fa3a9f07363b92270c84df83b98a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-subversion-doc \
subversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
