SUMMARY = "Documentation for texlive-icite"
DESCRIPTION = "This package includes the documentation for texlive-icite"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3asvn67201"

RPM_NAME = "texlive-icite-doc-2026.226.1.3asvn67201-60.2.noarch.rpm"
RPM_HASH = "eae687728cf09c8d738f31eed9ab01a3b23cd0b7dd746288e073f6f81d7679fc2d2319b21df2f37bf6cdf67ae2f8beb4e9ee05d0f7b5b11cb5cfbc74cdaccdca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-icite-doc"

RDEPENDS:${PN} += ""

inherit rpm
