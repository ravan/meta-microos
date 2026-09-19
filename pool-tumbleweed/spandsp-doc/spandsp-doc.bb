SUMMARY = "Documentation for the libspandsp API"
DESCRIPTION = "This package contains documentation for the libspandsp API."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.0+g57"

RPM_NAME = "spandsp-doc-3.0.0+g57-1.8.noarch.rpm"
RPM_HASH = "34e2b16ff824f335b4cf53d2108d80cd9479c045b8dd66584d7baddad96a7144fae3d5c21176d530baf3898433f50f496709a4f3ebbcc3e724a017ee68384e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spandsp-doc"

RDEPENDS:${PN} += ""

inherit rpm
