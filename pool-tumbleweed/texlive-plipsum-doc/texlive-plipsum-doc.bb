SUMMARY = "Documentation for texlive-plipsum"
DESCRIPTION = "This package includes the documentation for texlive-plipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3svn30353"

RPM_NAME = "texlive-plipsum-doc-2026.226.4.3svn30353-59.2.noarch.rpm"
RPM_HASH = "5951eb1016fe3ae81b8272d4d6e5df4d68d5ecf96739fd6486878f300137ca357f2b19787cb8afd90aeb52f120034fdf0dbf6de61563483a8e2571ba06e4215f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
