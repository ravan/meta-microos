SUMMARY = "Execute LISP code in a LaTeX document"
DESCRIPTION = "The package provides a LISP interpreter written using TeX \
macros; it is provided as a LaTeX package. The interpreter \
static scoping, dynamic typing, and eager evaluation."
LICENSE = "BSD-3-Clause"

PV = "2026.226.2.1svn73165"

RPM_NAME = "texlive-lisp-on-tex-2026.226.2.1svn73165-61.2.noarch.rpm"
RPM_HASH = "cb89f749c5dcb398ffd7cd1af6805f9101ff76aa5cbc9fdd76ac15def21e1dfcf04e83666c6c845cf9da1d063b99b96aed9deb223d23f1c8fef1d88d30ee2fa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lisp-arith.sty \
tex-lisp-gc.sty \
tex-lisp-latexutil.sty \
tex-lisp-mod-fpnum.sty \
tex-lisp-mod-l3regex.sty \
tex-lisp-on-tex.sty \
tex-lisp-prim.sty \
tex-lisp-read.sty \
tex-lisp-simple-alloc.sty \
tex-lisp-string.sty \
tex-lisp-util.sty \
texlive-lisp-on-tex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
