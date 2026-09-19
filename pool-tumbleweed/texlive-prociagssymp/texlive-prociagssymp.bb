SUMMARY = "Macros for IAG symposium papers"
DESCRIPTION = "This package provides (re-)definitions of some LaTeX commands \
that can be useful for the preparation of papers with the style \
of the proceedings of symposia sponsored by the 'International \
Association of Geodesy (IAG)' published by Springer-Verlag."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70888"

RPM_NAME = "texlive-prociagssymp-2026.226.svn70888-59.2.noarch.rpm"
RPM_HASH = "1cb4264600c1167b4a4abf05ac19d1e8f992b825bc8f6c2b6e34f539588c404023e1c4dd90e9bde44295eff2f4eeec4550fa082e25798e4de59f6d44c1c7222e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-procIAGssymp.sty \
texlive-prociagssymp"

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
