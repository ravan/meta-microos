SUMMARY = "Improved version of the physics package"
DESCRIPTION = "This package requires the amsmath, etoolbox, xcolor, xparse, \
and xstring packages. Commands that have different definitions \
come with PT in the beginning of their name (e.g. \\PTmqty). \
physics-patch has covered all commands in physics since version \
2.0, so there's no need to load physics. It is ok to load \
physics before this package. This package will silently \
override macros in physics with an improved version. To use the \
original version provided by physics, load physics before this \
package and use the nooverride option (not recommended). This \
package pretends that the physics package is loaded so that \
this package won't be overridden if loading physics is called \
afterwards and packages loaded afterwards that check whether \
physics is loaded to determine their behavior (e.g. siunitx) \
work correctly. To disable this, use the nopretend option (not \
recommended). If siunitx is loaded before this package, this \
package will define \\ITquantity and \\ITqty as the integration \
of the improved definition of physics's \\qty (in \\PHquantity \
and \\PHqty) and siuitx's \\SI. You can optionally set the \
siintegrate option to override \\PTquantity and \\PTqty with \
\\ITqty (not recommended). If two opposite options -- one of \
them with the name of the other prefixed with a no -- are \
loaded at the same time, the one without the no in the name \
will be used. If two opposite options which have the same \
suffix and different prefixes are loaded at the same time, the \
default one will be used."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn76924"

RPM_NAME = "texlive-physics-patch-2026.226.3.1svn76924-58.2.noarch.rpm"
RPM_HASH = "c9888a149a3c7fdf77a34e9825e82653cd7dc4a3e9780bf90bd1c492b67261971c62cef94d1b9078a367b9d515d4213a4c888944d9c435f9646b3d0b16da4133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-physics-patch.sty \
texlive-physics-patch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-siunitx.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
