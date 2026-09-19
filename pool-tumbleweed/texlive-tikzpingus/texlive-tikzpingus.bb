SUMMARY = "Penguins with TikZ"
DESCRIPTION = "tikzpingus is a package similar to TikZducks but with penguins \
and a vast set of gadgets and extras (capable of changing the \
wing-positions, body-types, and more)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn78219"

RPM_NAME = "texlive-tikzpingus-2026.226.1.4svn78219-59.2.noarch.rpm"
RPM_HASH = "6e2cb0811c2611f6e9c60f1aa6997e7d7314b8d0f4519f793363f3e11bcbda427d8a2ba1762e84dc58275722dddabdd49d1aa453ea03c3af64a7acaaf9f0a1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzpingus.sty \
texlive-tikzpingus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
