SUMMARY = "Documentation for texlive-utopia"
DESCRIPTION = "This package includes the documentation for texlive-utopia"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-utopia-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "de9396c43f58bcd734654b1b316c0c7bb69897ce48823ce1528d5fc25b5bde3197389d4a3a8dbafd669839d48a9fcb33d691552e71f9b0cbca572eed0926e95c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utopia-doc"

RDEPENDS:${PN} += ""

inherit rpm
