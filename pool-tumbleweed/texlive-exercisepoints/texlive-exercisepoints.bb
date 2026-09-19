SUMMARY = "A LaTeX package to count exercises and points"
DESCRIPTION = "The package can be used to facilitate exercise counting and \
exercise point counting in a LaTeX-document. It counts the \
number of exercises and it sums all the points of the exercises \
in a document. Especially for exams it is also common to have \
an overview of all exercises and their maximal points. This is \
also supported by this package by providing a macro to retrieve \
the points of each exercise."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.3svn49590"

RPM_NAME = "texlive-exercisepoints-2026.226.1.2.3svn49590-59.2.noarch.rpm"
RPM_HASH = "62c36aaa93c76c663fb7b6d3583f4b1a01e9ef732fe5adf94db300fe7ffeded7a5e743a59ceec5f793c258cf957c5028bdbc0af6d02641b90b0a405ee1f3b605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercisepoints.sty \
texlive-exercisepoints"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
