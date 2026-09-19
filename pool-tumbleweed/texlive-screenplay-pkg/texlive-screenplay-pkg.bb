SUMMARY = "Package version of the screenplay document class"
DESCRIPTION = "This package implements the tools of the screenplay document \
class in the form of a package so that screenplay fragments can \
be included within another document class. For full \
documentation of the available commands, please consult the \
screenplay class documentation in addition to the included \
package documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn44965"

RPM_NAME = "texlive-screenplay-pkg-2026.226.1.1svn44965-60.2.noarch.rpm"
RPM_HASH = "d861060c347d4fca50ceb1b50c25c1bb2d42e371c30f114b5a86ad27499aa144131df1fee6c832fa9eeebf7f1375e84eb180fcffc044662f9c0ea5db0d12c141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-screenplay-pkg.sty \
texlive-screenplay-pkg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
