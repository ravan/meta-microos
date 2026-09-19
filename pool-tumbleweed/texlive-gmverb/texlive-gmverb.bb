SUMMARY = "A variant of LaTeX \\verb, verbatim and shortvrb"
DESCRIPTION = "A redefinition of \\verb and verbatim so that long lines are \
breakable before \\ and after { with % as 'hyphen'. Allows you \
to define your own verbatim-like environments (subject to a \
size limit) and allows you to declare any single character as a \
shorthand as in the \\MakeShortVerb command of the shortvrb \
package of the LaTeX distribution. The package depends on the \
gmutils package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.98svn24288"

RPM_NAME = "texlive-gmverb-2026.226.0.0.98svn24288-60.4.noarch.rpm"
RPM_HASH = "8f469c8af446d014c159758b4dfe68987a20d0620e4488df4e7fddb0055c707adb7c841477e8f88db885b618c7bb3465c91ba82963ebe7cf0051458033c5987b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmverb.sty \
texlive-gmverb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eufrak.sty \
tex-gmcommand.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
