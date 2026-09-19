SUMMARY = "Documentation for texlive-fp"
DESCRIPTION = "This package includes the documentation for texlive-fp"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1dsvn77682"

RPM_NAME = "texlive-fp-doc-2026.226.2.1dsvn77682-60.2.noarch.rpm"
RPM_HASH = "05331b4812872a40dd2ef27994bd2caaca036c5fbc633222862ff4482f9ae8b8d69505ad36358f5192519ef73e3f2e73b0800cd335388218be66a4aa1b9e3dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fp-doc"

RDEPENDS:${PN} += ""

inherit rpm
