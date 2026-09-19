SUMMARY = "Adjusting the anchors of captions"
DESCRIPTION = "The package offers a solution to the problem that when you link \
to a float using hyperref, the link anchors to below the \
float's caption, rather than the beginning of the float. Hypcap \
defines a separate \\capstart command, which you put where you \
want links to end; you should have a \\capstart command for each \
\\caption command. Package options can be used to auto-insert a \
\\capstart at the start of a float environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn77682"

RPM_NAME = "texlive-hypcap-2026.226.1.13svn77682-60.2.noarch.rpm"
RPM_HASH = "245564ab8de8b70ce0a06867f5f161522bd1ca9c61941ebb02b8c17d3bd1c1a516148ced34b02931a0ff1d10afe4e9fa7edc5c7596fc2a49f5ec7965b7f9bd6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypcap.sty \
texlive-hypcap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-letltxmacro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
