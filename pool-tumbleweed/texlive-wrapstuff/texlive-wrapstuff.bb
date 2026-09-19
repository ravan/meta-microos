SUMMARY = "Wrapping text around stuff"
DESCRIPTION = "This package provides another implementation of text wrapping. \
Its implementation benefits from the paragraph hooks available \
since LaTeX 2021-06-01. English documentation is provided by \
the wrapstuff-doc-en package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-wrapstuff-2026.226.0.0.3svn77682-59.4.noarch.rpm"
RPM_HASH = "8a8cf540eb74aa913be831360a6dc665fc2194457f356cb85a27e1a1f2f577df77753f7c00f68787b26544df7737607cec56616180f670df88885cdf490600bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wrapstuff.sty \
texlive-wrapstuff"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
