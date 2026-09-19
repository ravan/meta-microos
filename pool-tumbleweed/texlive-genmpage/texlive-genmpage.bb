SUMMARY = "Generalization of LaTeX's minipages"
DESCRIPTION = "The GenMPage package generalizes LaTeX's minipages. Keyval \
options and styles can be used to determine their appearance in \
an easy and consistent way. Includes options for paragraph \
indentation and vertical alignment with respect to the visual \
top and bottom margins."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.1svn15878"

RPM_NAME = "texlive-genmpage-2026.226.0.0.3.1svn15878-60.2.noarch.rpm"
RPM_HASH = "f59fba0e5c0efaab7156a54417b0fa5cf7793857a69643a5fac55c3f52a21ecf55cd0a0bc6f7f65d8937caa0f39eaf2a243fcb950193be2a000bb2b2fb6ad8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-genmpage.sty \
texlive-genmpage"

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
