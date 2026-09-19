SUMMARY = "LaTeX interface for the CJK category codes of upTeX"
DESCRIPTION = "The package provides management of the CJK category code \
('kcatcode'> table of the upTeX extended TeX engine. Package \
options are available for tailored use in the cases of \
documents that are principally written in Japanese, or \
principally written in English or other Western languages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-pxcjkcat-2026.226.1.6svn77682-60.4.noarch.rpm"
RPM_HASH = "4e39f8fd88b97efb722f9285e41eb0923f78b905c8bd3e952a2a9cc0f8d8041c932b2d848b603b87911c8584ea97b9b69651e1268c59ac5d9d9ad9c5a3dc3503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxcjkcat.sty \
texlive-pxcjkcat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
