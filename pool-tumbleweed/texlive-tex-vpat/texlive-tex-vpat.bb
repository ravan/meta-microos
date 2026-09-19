SUMMARY = "TeX Accessibility Conformance Report"
DESCRIPTION = "TeX Accessibility Conformance Report based on ITI VPAT(R) \
guidelines. Currently it covers TeX Live. Other distributions \
can be added if needed."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.4svn72067"

RPM_NAME = "texlive-tex-vpat-2026.227.2.4svn72067-62.2.noarch.rpm"
RPM_HASH = "658ece9a7af57a2f3f90a531f8957e23680f58d8522fc2621bdae9fd9ae2dcb3365e205a1d705ce9605069ac7855202e6b6f5e9f9121b3a6f9853684840b8b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-vpat"

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
