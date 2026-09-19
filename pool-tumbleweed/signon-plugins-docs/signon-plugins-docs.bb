SUMMARY = "Documentation for the Single Sign On Framework's plugins"
DESCRIPTION = "This package contains the documentation for the Single Sign On Framework's \
plugins."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signon-plugins-docs-8.61-2.10.noarch.rpm"
RPM_HASH = "201af05605c26c50134d562c6ce0750dc3b72dc82a9844c0edb3e824eee1946b9f299a409f6fe11c0203c345d063130ffd194938f1fc6d0c10717aa37061efd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signon-plugins-docs"

RDEPENDS:${PN} += ""

inherit rpm
