SUMMARY = "Generate changebars in LaTeX documents"
DESCRIPTION = "Identify areas of text to be marked with changebars with the \
\\cbstart and \\cbend commands; the bars may be coloured. The \
package uses 'drivers' to place the bars; the available drivers \
can work with dvitoln03, dvitops, dvips, the emTeX and TeXtures \
DVI drivers, and VTeX and pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.7esvn77682"

RPM_NAME = "texlive-changebar-2026.226.3.7esvn77682-59.2.noarch.rpm"
RPM_HASH = "1c6de650b1c4dfd2a172cad0e4874f409961e7c6db50871ddb7a2e68b53d847a913bc89c8a1e05bd1bac5f8375404d1f33480ac83d502529ccfaf8f8ab4aab23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changebar.sty \
texlive-changebar"

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
