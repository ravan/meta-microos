SUMMARY = "User-friendly integration of Asymptote into LaTeX"
DESCRIPTION = "The package is an unofficial alternative to the package \
provided with the Asymptote distribution, for including \
pictures within a LaTeX source file. While it does not \
duplicate all the features of the official package, this \
package is more user-friendly in several ways. Most notably, \
Asymptote errors are repackaged as LaTeX errors, making \
debugging less of a pain. It also has a more robust mechanism \
for identifying unchanged pictures that need not be recompiled."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn73611"

RPM_NAME = "texlive-asypictureb-2026.226.0.0.4svn73611-60.2.noarch.rpm"
RPM_HASH = "94d7175914e5ac8269a12eac92d125646643d7b81289130e8d12d8bafe3ee58bb968862a297ce4815fa58e433bbdd913db198ab24916519b205c8a7fa93e162b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asypictureB.sty \
texlive-asypictureb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyvrb.sty \
tex-graphicx.sty \
tex-ifplatform.sty \
tex-pgfkeys.sty \
tex-verbatimcopy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
