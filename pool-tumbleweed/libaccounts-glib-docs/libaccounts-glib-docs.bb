SUMMARY = "Documentation for libaccounts-glib"
DESCRIPTION = "This package contains the documentation for the accounts-glib \
library."
LICENSE = "LGPL-2.1-only"

PV = "1.27"

RPM_NAME = "libaccounts-glib-docs-1.27-1.10.noarch.rpm"
RPM_HASH = "3ad84841dbab0db0044360370c75923a9c1af113b8b739747dbcabba1868976bcb99f5436ee19315fe5517a13b6d684b4dfbef3a7d5bb4b3bbfcd1542e9b60d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libaccounts-glib-docs"

RDEPENDS:${PN} += ""

inherit rpm
