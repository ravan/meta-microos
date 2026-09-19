SUMMARY = "A symbol (dingbat) font and LaTeX macros for its use"
DESCRIPTION = "A symbol font (distributed as Metafont source) that contains \
many of the symbols of the Zapf dingbats set, together with an \
NFSS interface for using the font. An Adobe Type 1 version of \
the fonts is available in the niceframe fonts bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-bbding-2026.226.1.01svn77682-61.2.noarch.rpm"
RPM_HASH = "dbd2f760f3a4228945a9e41d1b16956da60485bfd1b574903849a471be427d795a877c9a1addad91796ea69d0c143a79708259d98941ca6b9669e442d03689fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Uding.fd \
tex-bbding.sty \
tex-bbding10.tfm \
texlive-bbding"

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
