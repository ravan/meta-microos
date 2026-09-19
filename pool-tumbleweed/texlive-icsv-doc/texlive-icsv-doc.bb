SUMMARY = "Documentation for texlive-icsv"
DESCRIPTION = "This package includes the documentation for texlive-icsv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-icsv-doc-2026.226.0.0.2svn15878-60.2.noarch.rpm"
RPM_HASH = "c26e6b9c490d33903391b7fb98b069a49b7b08880de1f9172d5f3eba13a1a30242d8d79877741b9bff0b57ca905c262e938a98331c379eca237c0f4d745b45bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-icsv-doc"

RDEPENDS:${PN} += ""

inherit rpm
