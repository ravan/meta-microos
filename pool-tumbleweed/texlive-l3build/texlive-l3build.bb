SUMMARY = "A testing and building system for (La)TeX"
DESCRIPTION = "The build system supports testing and building LaTeX3 code, on \
Linux, Mac OS X and Windows systems. The package offers: A unit \
testing system for (La)TeX code (whether kernel code or \
contributed packages); A system for typesetting package \
documentation; and An automated process for creating CTAN \
releases. The package is essentially independent of other \
material released by the LaTeX3 team, and may be updated on a \
different schedule."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77170"

RPM_NAME = "texlive-l3build-2026.226.svn77170-63.2.noarch.rpm"
RPM_HASH = "3e9dadbcee80747edbfd69491c0ea4b5fc03567a54c44354217fd1e87e32c233ef0caf026e43389c920d8c39f79ac4e717c722d8d89ccc0446f7f819920e4a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regression-test.tex \
texlive-l3build"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3build-bin \
texlive-luatex \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
