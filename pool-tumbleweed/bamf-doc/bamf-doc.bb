SUMMARY = "Documentation for libbamf and libbamf3"
DESCRIPTION = "This package contains the documentation for the bamf library."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "bamf-doc-0.5.6-1.17.noarch.rpm"
RPM_HASH = "d90e07078819be7ca166c86c7a94ff973ff681ca70f7182945babbb3c20f1ab74a3d00e3ddebcae515df929a01e52ae5ad5e18463673eab34e14ad3392d72ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bamf-doc"

RDEPENDS:${PN} += ""

inherit rpm
