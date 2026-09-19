SUMMARY = "Macros to write format-independent packages"
DESCRIPTION = "Texapi provides utility macros to write format-independent (and \
-aware) packages. It is similar in spirit to the etoolbox, \
except that it isn't tied to LaTeX. Tools include: engine and \
format detection, expansion control, command definition and \
manipulation, various testing macros, string operations, and \
highly customizable while and for loops. The package requires \
e-TeX (and, should you want to compile its documentation, the \
pitex package is also needed)."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.04svn54080"

RPM_NAME = "texlive-texapi-2026.227.1.04svn54080-62.2.noarch.rpm"
RPM_HASH = "44cac4699ee8b1ce4920aaedf1b75c1abe4c9186f553d1491044ca1938807303a153c56b0d2a91a261a43da3694fec902712741947c327e098fea15ab2ce215d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texapi.tex \
texlive-texapi"

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
