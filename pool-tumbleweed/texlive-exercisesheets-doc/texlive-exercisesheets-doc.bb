SUMMARY = "Documentation for texlive-exercisesheets"
DESCRIPTION = "This package includes the documentation for texlive-exercisesheets"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.17svn76924"

RPM_NAME = "texlive-exercisesheets-doc-2026.226.0.0.17svn76924-59.2.noarch.rpm"
RPM_HASH = "462e0f0556ea38090f7a91f1e2a16a9928a76c37bf6efacbc27b8eaf2d3e556cff86c3f12c265885540fa25ab3ce3c6de6c773ffc065bd08a253c94881ffba80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercisesheets-doc"

RDEPENDS:${PN} += ""

inherit rpm
