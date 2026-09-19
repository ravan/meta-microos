SUMMARY = "Query or install TeX packages and their dependencies"
DESCRIPTION = "This package makes it easy to query or install TeX packages and \
their dependencies by file names, command names or environment \
names. TeXFindPkg supports both TeX Live and MiKTeX \
distributions. At present it focuses mainly on LaTeX packages, \
but may be extended to ConTeXt packages if anyone would like to \
contribute."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.2024asvn72937"

RPM_NAME = "texlive-texfindpkg-2026.227.2024asvn72937-62.2.noarch.rpm"
RPM_HASH = "ac3d603c297a84ac38725cbde129df04d2870fea6bb6fd52b5ef5b3a51710ad8003d8e1ec4f62d6ed26b27475adf413295a86ca70f6b124e801581a6f2fd76f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texfindpkg"

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
texlive-scripts-bin \
texlive-texfindpkg-bin"

inherit rpm
