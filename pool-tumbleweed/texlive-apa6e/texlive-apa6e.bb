SUMMARY = "Format manuscripts to APA 6th edition guidelines"
DESCRIPTION = "This is a minimalist class file for formatting manuscripts in \
the style described in the American Psychological Association \
(APA) 6th edition guidelines. The apa6 class provides better \
coverage of the requirements."
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.3svn23350"

RPM_NAME = "texlive-apa6e-2026.226.0.0.3svn23350-61.2.noarch.rpm"
RPM_HASH = "c78509716bfe793e84c85723278abaed84b8e4bedb85ec0519b6cc1908e3716adbc54dc03b19f3c5429d46b9a481ae9f865ae49b92a3a2002ac93b67a0e5d44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apa6e.cls \
texlive-apa6e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-caption.sty \
tex-endfloat.sty \
tex-endnotes.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-mathptmx.sty \
tex-ragged2e.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
