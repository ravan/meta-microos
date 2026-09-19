SUMMARY = "Clever LaTeX cross-references based on zref"
DESCRIPTION = "This package provides a user interface for making LaTeX \
cross-references which automates some of their typical \
features, thus easing their input in the document and improving \
the consistency of typeset results. A reference made with \
\\zcref includes a 'name' according to its 'type', and lists of \
multiple labels can be automatically sorted and compressed into \
ranges when due. The reference format is highly and easily \
customizable, both globally and locally. The package is based \
on zref's extensible referencing system."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.1svn77682"

RPM_NAME = "texlive-zref-clever-2026.226.0.0.5.1svn77682-59.4.noarch.rpm"
RPM_HASH = "3f36539cb5bb996412a2763f12cdf2260498c821422567cfbc4cdaf33beb5f73c1f9c7c3ea779b673d2e878ade67d10e22fed813bac6e28da6d4ff2536d761f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zref-clever.sty \
texlive-zref-clever"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifdraft.sty \
tex-zref-abspage.sty \
tex-zref-base.sty \
tex-zref-hyperref.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oberdiek \
texlive-scripts \
texlive-scripts-bin \
texlive-zref"

inherit rpm
