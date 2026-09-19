SUMMARY = "Documentation for texlive-runtexshebang"
DESCRIPTION = "This package includes the documentation for texlive-runtexshebang"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn68882"

RPM_NAME = "texlive-runtexshebang-doc-2026.226.0.0.5svn68882-60.2.noarch.rpm"
RPM_HASH = "9b9a9a64b38cf7b679453261f59d53559b2e6b0cbaacd370b761c73c3e3c9e8ef418cb2104dd7c77978556fc97b2a7c02156105acb3f7aa2da38db3109c29c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-runtexshebang-doc"

RDEPENDS:${PN} += ""

inherit rpm
