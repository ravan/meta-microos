SUMMARY = "Documentation for texlive-tlc-article"
DESCRIPTION = "This package includes the documentation for texlive-tlc-article"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.0.17svn51431"

RPM_NAME = "texlive-tlc-article-doc-2026.226.1.0.17svn51431-59.2.noarch.rpm"
RPM_HASH = "4ce87b240fd30d0f0bf92c065a72277aff862fd0b7f8e197e94458f2b44d8c542578466f972beefa63113f621202cb13c0754922b1f82eb14a77e1714ffa26cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlc-article-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
