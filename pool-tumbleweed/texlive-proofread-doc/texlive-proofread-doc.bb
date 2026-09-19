SUMMARY = "Documentation for texlive-proofread"
DESCRIPTION = "This package includes the documentation for texlive-proofread"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn61719"

RPM_NAME = "texlive-proofread-doc-2026.226.1.04svn61719-59.2.noarch.rpm"
RPM_HASH = "113720a13d15ef22565e5d36db51f9f5e35a97952da85892afbf39badd7d88181f10ba3ebadde7319bf580cb8652a1f3de4397e638e766c04c29876a7625ec62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proofread-doc"

RDEPENDS:${PN} += ""

inherit rpm
