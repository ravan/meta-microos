SUMMARY = "Figures broken into subfigures"
DESCRIPTION = "The package provides support for the manipulation and reference \
of small or 'sub' figures and tables within a single figure or \
table environment. It is convenient to use this package when \
your subfigures are to be separately captioned, referenced, or \
are to be included in the List-of-Figures. A new \\subfigure \
command is introduced which can be used inside a figure \
environment for each subfigure. An optional first argument is \
used as the caption for that subfigure. This package supersedes \
the subfigure package (which is no longer maintained). The name \
was changed since the package is not completely backward \
compatible with the older package The major advantage of the \
new package is that the user interface is keyword/value driven \
and easier to use. To ease the transition from the subfigure \
package, the distribution includes a configuration file \
(subfig.cfg) which nearly emulates the subfigure package. The \
functionality of the package is provided by the (more recent \
still) subcaption package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-subfig-2026.226.1.3svn77682-64.2.noarch.rpm"
RPM_HASH = "ec3e168c3f3e8da8cabc00a7826e22e0eb8d05bcac05c0167fcb30c0890278d5dc7de977bbf808e49cb02692eaea1c3823ee38e1cc1bac238c808293d6f0520e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-altsf.cfg \
tex-subfig.sty \
texlive-subfig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-caption3.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
