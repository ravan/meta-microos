SUMMARY = "Variants of common box-commands that read their content as real box and not as macro argument"
DESCRIPTION = "The package uses the author's package collectbox to define \
variants of common box related macros which read the content as \
real box and not as macro argument. This enables the use of \
verbatim or other special material as part of this content. The \
provided macros have the same names as the original versions \
but start with an upper-case letter instead. The 'long-form' \
macros, like \\Makebox, can also be used as environments, but \
not the 'short-form' macros, like \\Mbox. However, normally the \
long form uses the short form anyway when no optional arguments \
are used."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-realboxes-2026.226.0.0.2svn77682-60.4.noarch.rpm"
RPM_HASH = "b964f6adae6996077c1f404276cfad59631ce33679725362fa263fd4862c40ef7a4692edb04c721c44c2dc047bee3ad76fc4ce40e7886e08b1863452a0e1bbb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realboxes.sty \
texlive-realboxes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjcalc.sty \
tex-calc.sty \
tex-collectbox.sty \
tex-color.sty \
tex-dashbox.sty \
tex-fancybox.sty \
tex-graphics.sty \
tex-graphicx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
