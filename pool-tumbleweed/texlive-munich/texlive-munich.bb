SUMMARY = "An alternative authordate bibliography style"
DESCRIPTION = "The Munich BibTeX style is produced with custom-bib, as a \
German (and, more generally, Continental European) alternative \
to such author-date styles as harvard and oxford."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-munich-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "7f49b02ffc0e963257b653d6200a079faf814d393ac8db0efdc7366fd52d9df2b86ad3107f747dd4030b3a59331b3e7f312daec8d00a3cacf467f27acba045ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-munich"

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
