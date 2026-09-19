SUMMARY = "Manage footnote marks' interaction with punctuation"
DESCRIPTION = "The package moves footnote marks after following punctuation \
(comma or full stop), and adjusts kerning as appropriate. As a \
side effect, a change to the handling of multiple footnotes is \
provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-fnpct-2026.226.1.1asvn77682-60.2.noarch.rpm"
RPM_HASH = "853f70d34149db457cbaaf2ac3bbf185cd783724dc6e516ba8ac7fa4785a8d225731d55f03beaf6e10438cd874eae7de8a51e259fb67ed8fe9238da061e6f62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnpct-2019-10-05.sty \
tex-fnpct.sty \
texlive-fnpct"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-scrextend.sty \
tex-scrlfile.sty \
tex-translations.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
