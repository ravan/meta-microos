SUMMARY = "Documentation for libaccounts-qt"
DESCRIPTION = "This package contains the documentation for the accounts-qt library."
LICENSE = "LGPL-2.1-only"

PV = "1.16git.20231124T162152~18557f7"

RPM_NAME = "libaccounts-qt6-doc-1.16git.20231124T162152~18557f7-1.10.noarch.rpm"
RPM_HASH = "66fb5d0c50f09c533c21182c3de8499cd1a29ad7463159f579356aa613fa05e08ede3b5d2cbb25c60b76c8baa1029440818ea08cdb862804f5400c3805797a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libaccounts-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
