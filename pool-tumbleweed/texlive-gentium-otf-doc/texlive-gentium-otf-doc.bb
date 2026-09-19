SUMMARY = "Documentation for texlive-gentium-otf"
DESCRIPTION = "This package includes the documentation for texlive-gentium-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-gentium-otf-doc-2026.226.1.01svn77682-60.2.noarch.rpm"
RPM_HASH = "dc4285e172b299603d32e69e88d1e59854f7d742dd9cb93bc94bbe438032b8d7e21e03200348bcab3b35a8163040e6ad0f32b9b65a944126a65343b5bfa56852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gentium-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
