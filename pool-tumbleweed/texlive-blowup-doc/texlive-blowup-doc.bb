SUMMARY = "Documentation for texlive-blowup"
DESCRIPTION = "This package includes the documentation for texlive-blowup"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.0svn77682"

RPM_NAME = "texlive-blowup-doc-2026.226.2.2.0svn77682-59.2.noarch.rpm"
RPM_HASH = "b018bf704b28a0aef65b9d015da9f99da205f666c11bb0a95aae297de1dc2a36b0f0ae6394312a9de939067d75f00930a34f064462cc709a390992f14003970f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blowup-doc"

RDEPENDS:${PN} += ""

inherit rpm
