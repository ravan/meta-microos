SUMMARY = "Documentation for texlive-babel-occitan"
DESCRIPTION = "This package includes the documentation for texlive-babel-occitan"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn39608"

RPM_NAME = "texlive-babel-occitan-doc-2026.226.0.0.2svn39608-60.2.noarch.rpm"
RPM_HASH = "35f29f4979b7073fe1db6ddc0bf3f3bd07d2cc828a864b64d8d686624faeb5920017a50ebfc24a32f4bfec5d1f1cd7699824a5781f77d925b92278b6d4085813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-occitan-doc"

RDEPENDS:${PN} += ""

inherit rpm
