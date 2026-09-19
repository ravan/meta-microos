SUMMARY = "Documentation for texlive-profmaquette"
DESCRIPTION = "This package includes the documentation for texlive-profmaquette"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.99_qsvn77282"

RPM_NAME = "texlive-profmaquette-doc-2026.226.0.0.99_qsvn77282-59.2.noarch.rpm"
RPM_HASH = "1fc7432634cbcebb46eee0661f68accc1ca86360943215bcc77a522b35bf3e53d13e2e66a475afb96d48632e307b023de54ba92944e4df7d3be69b336129785f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-profmaquette-doc-fr \
texlive-profmaquette-doc"

RDEPENDS:${PN} += ""

inherit rpm
