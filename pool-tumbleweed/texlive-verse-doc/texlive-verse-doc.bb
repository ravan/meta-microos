SUMMARY = "Documentation for texlive-verse"
DESCRIPTION = "This package includes the documentation for texlive-verse"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4csvn77682"

RPM_NAME = "texlive-verse-doc-2026.226.2.4csvn77682-60.2.noarch.rpm"
RPM_HASH = "68eb1d8c88e9c8768c8b3ce69691963a76e6056491a502a466e4d192775e2538023e708351fdef3a8d66c141e1959ccc4a26cf45768d5515dbd50fc029595026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verse-doc"

RDEPENDS:${PN} += ""

inherit rpm
