SUMMARY = "Mathematical tools to use with amsmath"
DESCRIPTION = "Mathtools provides a series of packages designed to enhance the \
appearance of documents containing a lot of mathematics. The \
main backbone is amsmath, so those unfamiliar with this \
required part of the LaTeX system will probably not find the \
packages very useful. Mathtools provides many useful tools for \
mathematical typesetting. It is based on amsmath and fixes \
various deficiencies of amsmath and standard LaTeX. It \
provides Extensible symbols, such as brackets, arrows, \
harpoons, etc.; Various symbols such as \\coloneqq (:=); Easy \
creation of new tag forms; Showing equation numbers only for \
referenced equations; Extensible arrows, harpoons and \
hookarrows; Starred versions of the amsmath matrix environments \
for specifying the column alignment; More building blocks: \
multlined, cases-like environments, new gathered environments; \
Maths versions of \\makebox, \\llap, \\rlap etc.; Cramped math \
styles; and more... Mathtools requires mhsetup."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.31svn77682"

RPM_NAME = "texlive-mathtools-2026.226.1.31svn77682-59.2.noarch.rpm"
RPM_HASH = "5c7fc97741ae320797b94d4897e7ecddb6523105592491a9a6d72a84ead74ce35e9a96e50ec71a2be08126eb2cb85d1b15c4d43047f589048ae76f6ac31c714a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-empheq.sty \
tex-mathtools.sty \
tex-mhsetup.sty \
texlive-mathtools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-graphicx.sty \
tex-keyval.sty \
texlive \
texlive-amsmath \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
