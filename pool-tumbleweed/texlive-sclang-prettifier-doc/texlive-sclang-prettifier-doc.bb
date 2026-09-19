SUMMARY = "Documentation for texlive-sclang-prettifier"
DESCRIPTION = "This package includes the documentation for texlive-sclang-prettifier"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn35087"

RPM_NAME = "texlive-sclang-prettifier-doc-2026.226.0.0.1svn35087-60.2.noarch.rpm"
RPM_HASH = "99f95d3e0c71ce3801817b8a52cf3b6728afb9a47a1a3ce6cf39a42be405cee2639221ae0fb4b3174208805df08d8729aeb3b64b23ed33e3d3f79ac37d6b7f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sclang-prettifier-doc"

RDEPENDS:${PN} += ""

inherit rpm
