SUMMARY = "Containers for data in LaTeX"
DESCRIPTION = "The package allows the user to declare single object or array \
containers."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn30452"

RPM_NAME = "texlive-memory-2026.226.1.2svn30452-59.2.noarch.rpm"
RPM_HASH = "33f9bf3b71ff94fbba240d00a1fd1eb6b4ca704c71e15cd8c208d55f13c90362b58effddc3b43bf2137987b98bf48d358de45676e3206f3cdb74cb42e547c720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-memory.sty \
texlive-memory"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
