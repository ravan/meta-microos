SUMMARY = "A LaTeX template for your resume"
DESCRIPTION = "This package provides a compact and elegant template for your \
resume."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74532"

RPM_NAME = "texlive-pats-resume-2026.226.svn74532-58.2.noarch.rpm"
RPM_HASH = "0727aa037123ead3cc2e9cf91bb265b4b2a6f93b307e08a6efce0ebd6b351bfe710d376cefae93624f14f54d09d303680ce0415e69698782f819bcff2759b130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pats-resume.cls \
texlive-pats-resume"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-comment.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fontawesome5.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-microtype.sty \
tex-paracol.sty \
tex-supertabular.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
