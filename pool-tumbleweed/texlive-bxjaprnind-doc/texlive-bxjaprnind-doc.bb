SUMMARY = "Documentation for texlive-bxjaprnind"
DESCRIPTION = "This package includes the documentation for texlive-bxjaprnind"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn59641"

RPM_NAME = "texlive-bxjaprnind-doc-2026.226.0.0.4asvn59641-59.2.noarch.rpm"
RPM_HASH = "ce327bfeecb4e6629611c9a640f791ef15e4c077f21ca370f149c754385d4979ccc9fe9e904805b48a6cdae82126e9c0e8dc69f138d24e56093b852a86bb513d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxjaprnind-doc-ja \
texlive-bxjaprnind-doc"

RDEPENDS:${PN} += ""

inherit rpm
