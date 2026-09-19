SUMMARY = "Typeset letters in the French style"
DESCRIPTION = "A small class for typesetting letters in France. No assumption \
is made about the language in use. The class represents a small \
modification of the beletter class, which is itself a \
modification of the standard LaTeX letter class."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-frletter-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "6c8c6232411e07be2e58dfa0184b148312b5020673583e9d96e298438df952df7a3fdd4ef31a8c90f8a9d6bba0e2e0bd4e5492626c29d377964e988170d37d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frletter.cls \
texlive-frletter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-letter.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
