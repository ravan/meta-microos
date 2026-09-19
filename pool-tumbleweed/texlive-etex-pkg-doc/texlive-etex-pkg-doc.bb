SUMMARY = "Documentation for texlive-etex-pkg"
DESCRIPTION = "This package includes the documentation for texlive-etex-pkg"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-etex-pkg-doc-2026.226.2.7svn77682-59.2.noarch.rpm"
RPM_HASH = "836c8b5f2af917c33b66a82d7d0ea9490aa7eeca77b836470fa38bfcf1bd89b069781940b014bdd937564f7cb3ee264e82c76d45d46ff7c175dba1b69fbbc394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etex-pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
