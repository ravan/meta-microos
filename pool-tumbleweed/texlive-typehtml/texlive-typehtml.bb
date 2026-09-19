SUMMARY = "Typeset HTML directly from LaTeX"
DESCRIPTION = "Can handle almost all of HTML2, and most of the math fragment \
of the draft HTML3."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17134"

RPM_NAME = "texlive-typehtml-2026.226.svn17134-59.2.noarch.rpm"
RPM_HASH = "a6f6156769fd6d9c6e94f116f16acab16683e109fc57fe4bda9740bb196955e8ac5d3a2bff3113c8915583310161145bcb01409946ec8ad886312b028a15e002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typehtml.sty \
texlive-typehtml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-exscale.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
