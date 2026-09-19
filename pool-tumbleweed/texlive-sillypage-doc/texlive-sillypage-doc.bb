SUMMARY = "Documentation for texlive-sillypage"
DESCRIPTION = "This package includes the documentation for texlive-sillypage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77682"

RPM_NAME = "texlive-sillypage-doc-2026.226.1.7svn77682-60.2.noarch.rpm"
RPM_HASH = "b93624f77d92379d74d14628f9958fcf9656d44224a55cf88dcc214fba830975f5feba482ce38807410839a65158c3ff83ddb28f676b626b4e62652c907b18d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sillypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
