SUMMARY = "Macros for constructing complex semantic derivations"
DESCRIPTION = "The primary goal of this package is to provide a minimal and \
user-friendly syntax for constructing large and complex \
semantic derivations, following the specific notational style \
used at Goethe University Frankfurt. It includes a \
comprehensive set of commands for text formatting and various \
types of bracketing, ensuring a consistent style -- \
particularly when distinguishing between meta-language and \
object-language within a single derivation or formula. The \
formula style is loosely based on the accompanying material to \
an introductory course to linguistic semantics by Prof. Dr. \
Thomas Ede Zimmermann. The package brings together and refines \
a collection of LaTeX commands and concepts developed over the \
years within the Department of Linguistics at the \
Goethe-Universitat at Frankfurt am Main. In the process of \
preparing research papers, assignments, and examinations, \
numerous custom LaTeX headers and commands were shared within \
the department -- some mutually compatible, others not. Note: \
The package name is an abbreviation of 'Frankfurt Goethe \
Linguistic'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.3svn76924"

RPM_NAME = "texlive-fragoli-2026.226.1.2.3svn76924-60.2.noarch.rpm"
RPM_HASH = "8a67675314794eb9e9046d52f006fc9438648e3442ddc46b70ef4c3a5c058a9d89a528e1c3139e4ff796e782b0fd4c2c665ec30a79ef1d7f469116145d42471d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fragoli.sty \
texlive-fragoli"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-comment.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-kvoptions.sty \
tex-nicefrac.sty \
tex-pdftexcmds.sty \
tex-stmaryrd.sty \
tex-ulem.sty \
tex-varwidth.sty \
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
