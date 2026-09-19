SUMMARY = "Documentation for texlive-luagcd"
DESCRIPTION = "This package includes the documentation for texlive-luagcd"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76790"

RPM_NAME = "texlive-luagcd-doc-2026.226.1.1svn76790-59.2.noarch.rpm"
RPM_HASH = "0392e8f895b7909d87a7e62a48b7d4f3bbff77493d5a697a648d57c1b6fa4798e2e2d190277aea1cd82fa992e4fcd62b93c8c300d617ea688fb02dbf761af003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luagcd-doc"

RDEPENDS:${PN} += ""

inherit rpm
