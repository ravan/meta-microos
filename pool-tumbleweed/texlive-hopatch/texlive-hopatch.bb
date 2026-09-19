SUMMARY = "Load patches for packages"
DESCRIPTION = "Hopatch provides a command with which the user may register of \
patch code for a particular package. Hopatch will apply the \
patch immediately, if the relevant package has already been \
loaded; otherwise it will store the patch until the package \
appears."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn65491"

RPM_NAME = "texlive-hopatch-2026.226.1.5svn65491-60.4.noarch.rpm"
RPM_HASH = "041e95b6ade5a9ee9a0873e6e97cc807c019ca108f24db02364b15b36848ee2fa4886573f00ffd92adfbfec59c7bab2d9e4440c04c1767c67cbdc7dea0af8a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hopatch-2016-05-16.sty \
tex-hopatch.sty \
texlive-hopatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
