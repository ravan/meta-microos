SUMMARY = "Documentation for texlive-storebox"
DESCRIPTION = "This package includes the documentation for texlive-storebox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn77682"

RPM_NAME = "texlive-storebox-doc-2026.226.1.3asvn77682-64.2.noarch.rpm"
RPM_HASH = "262dc82d6f575457e2302fc7d83ccfb219305bff9a02a67a6b84bf29a0a063f6e92bdce46be9fda315aa5a51c5248dcef52d03cd9f92a54163726558f85809bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-storebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
