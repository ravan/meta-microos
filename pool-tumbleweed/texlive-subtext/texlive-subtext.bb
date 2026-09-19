SUMMARY = "Easy text-style subscripts in math mode"
DESCRIPTION = "This LaTeX package gives easy access to text-style subscripts \
in math mode by providing an optional argument to _. This is \
implemented by using the \\text{} command from the amstext \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn51273"

RPM_NAME = "texlive-subtext-2026.226.1.1svn51273-64.2.noarch.rpm"
RPM_HASH = "d46e83dd80dd9cef88c3d9031bbeac3b7e7288375f0ecb07177317e0ee6b9521cbd303edfc032e27b94e632410b3769702a8accbfd96ba2722615ea020f8a934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subtext.sty \
texlive-subtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
