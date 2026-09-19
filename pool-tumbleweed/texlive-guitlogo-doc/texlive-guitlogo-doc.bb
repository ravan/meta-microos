SUMMARY = "Documentation for texlive-guitlogo"
DESCRIPTION = "This package includes the documentation for texlive-guitlogo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0_alpha.4svn55741"

RPM_NAME = "texlive-guitlogo-doc-2026.226.1.0.0_alpha.4svn55741-60.4.noarch.rpm"
RPM_HASH = "5bf5113689b9de8588602c8a7175b8a99da78fa25a948903630a8f9f50634be68ec1fab812b08fa428dc3d80f88bfb68aa7b45b57dd0c5a853ea0a90ed916288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-guitlogo-doc-it \
texlive-guitlogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
