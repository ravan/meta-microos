SUMMARY = "Documentation for texlive-bashful"
DESCRIPTION = "This package includes the documentation for texlive-bashful"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.93svn25597"

RPM_NAME = "texlive-bashful-doc-2026.226.0.0.93svn25597-60.2.noarch.rpm"
RPM_HASH = "8199248ca268eadbdb49de9439f0ba4de43a588b5ddd3b11103bb841eb381ea207cb0954bf87877541a6f13141a5cd0cddb90351353a1c3eb608b766dd746de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bashful-doc"

RDEPENDS:${PN} += ""

inherit rpm
