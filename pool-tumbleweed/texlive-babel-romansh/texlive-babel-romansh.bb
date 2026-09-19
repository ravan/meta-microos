SUMMARY = "Babel/Polyglossia support for the Romansh language"
DESCRIPTION = "The package provides a language description file that enables \
support of Romansh either with babel or with polyglossia."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-babel-romansh-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "19cf6f7a084b645e3d97f9865c4be28d6284259857a48b172bf8a720b1f8b7a26c7c0aef445a13493b94ae826706691104db1624f62460b07f79e4c66c1be8bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romansh.ldf \
texlive-babel-romansh"

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
