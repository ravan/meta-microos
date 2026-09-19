SUMMARY = "Sanitize umlauts for MakeIndex and pdfLaTeX"
DESCRIPTION = "This package sanitizes umlauts to be used directly in index \
entries for MakeIndex and friends with pdfLaTeX. This means \
that inside \\index an umlaut can be used as 'U or as U. In both \
cases, the letter is written as 'U into the raw index file for \
correct processing with MakeIndex and pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn77720"

RPM_NAME = "texlive-sanitize-umlaut-2026.226.1.4.0svn77720-60.2.noarch.rpm"
RPM_HASH = "eb27d64a66bf40dd1f26c59884acab8d2df3450f66dc82eff2075de8b2120cefec247a61b8ed9d40604c720f4174dddadb91db37b1b40e9f3c0b18b617b4dd0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sanitize-umlaut.sty \
texlive-sanitize-umlaut"

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
