SUMMARY = "Enhanced theorem environment"
DESCRIPTION = "The package offers enhancements for theorem-like environments: \
easier control of layout; proper placement of endmarks even \
when the environment ends with \\end{enumerate} or \
\\end{displaymath} (including support for amsmath \
displayed-equation environments); and support for making a list \
of theorems, analagous to \\listoffigures."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.33svn77682"

RPM_NAME = "texlive-ntheorem-2026.226.1.33svn77682-61.2.noarch.rpm"
RPM_HASH = "2ef71d6c50117e1b0e1ac4987722b2b248a62fc5744ec3b3462b835dfd7f900217413d20a81fbaae55f4cc0329fb3ce8e850edaecbbbb1905c34f9ccda5052ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ntheorem.sty \
texlive-ntheorem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
