SUMMARY = "Produces figures which text can flow around"
DESCRIPTION = "Allows figures or tables to have text wrapped around them. Does \
not work in combination with list environments, but can be used \
in a parbox or minipage, and in twocolumn format. Supports the \
float package."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn77682"

RPM_NAME = "texlive-wrapfig-2026.226.3.6svn77682-59.4.noarch.rpm"
RPM_HASH = "1b93f7e1453abdbaf792b55fbecc494f2351e7af97d83a140e6bbc5f71283ee42443010e6885ea1e75ddbe2cdbffca583c5f8309d7e8557aafec5b23109ed9b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wrapfig.sty \
texlive-wrapfig"

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
