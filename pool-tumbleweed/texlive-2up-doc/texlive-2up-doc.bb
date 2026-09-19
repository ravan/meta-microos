SUMMARY = "Documentation for texlive-2up"
DESCRIPTION = "This package includes the documentation for texlive-2up"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn55076"

RPM_NAME = "texlive-2up-doc-2026.226.1.3asvn55076-61.2.noarch.rpm"
RPM_HASH = "a85ef0249f24c52255358beaee3f2e7a7e7e418d6ee2a75f6523734be85a2066dcdf4d7612d4d75381c946ec0d8a587a8b613ce14e62725d7e22041c7d90c573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-2up-doc"

RDEPENDS:${PN} += ""

inherit rpm
