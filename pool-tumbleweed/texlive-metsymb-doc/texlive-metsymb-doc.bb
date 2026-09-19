SUMMARY = "Documentation for texlive-metsymb"
DESCRIPTION = "This package includes the documentation for texlive-metsymb"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.2.0svn68175"

RPM_NAME = "texlive-metsymb-doc-2026.226.1.2.0svn68175-61.2.noarch.rpm"
RPM_HASH = "d898ddc03a4b6925bd9612da98ac95bd8b53a434c1f9f8fed0a43dd86b1fd0d796ba63acdb3362b9f6362fb27ca258cc7bef20afc9a1ff6339fd3e38029e8645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metsymb-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
