SUMMARY = "Documentation for texlive-xintsession"
DESCRIPTION = "This package includes the documentation for texlive-xintsession"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4alphasvn60926"

RPM_NAME = "texlive-xintsession-doc-2026.226.0.0.4alphasvn60926-59.4.noarch.rpm"
RPM_HASH = "458e2ec172ad901c984276ff6038c05afe5ec82fe5619ca3a270b843b6072a59cd0b117a15f6b33bf986145b83e867e78d1f574d70c8d8d28795971561c8d1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xintsession-doc"

RDEPENDS:${PN} += ""

inherit rpm
