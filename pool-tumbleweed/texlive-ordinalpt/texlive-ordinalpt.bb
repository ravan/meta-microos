SUMMARY = "Counters as ordinal numbers in Portuguese"
DESCRIPTION = "The package provides a counter style (like \\arabic, \\alph and \
others) which produces as output strings like 'primeiro' \
('first' in Portuguese), 'segundo' (second), and so on up to \
1999th. Separate counter commands are provided for different \
letter case variants, and for masculine and feminine gender \
inflections."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-ordinalpt-2026.226.2.1svn15878-61.2.noarch.rpm"
RPM_HASH = "d421888bfd26d9beafdc96a52fb8bb44aa7eed278d3c2c69c6fa5ca24fdd7165e0bf0ceef4cc69f975d6526496771ef74bd90c2a5c5aad803da28c6596987e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ordinalpt.sty \
texlive-ordinalpt"

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
