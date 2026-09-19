SUMMARY = "Extended array and tabular"
DESCRIPTION = "An experimental package which implements an environment, \
blockarray, that may be used in the same way as the array or \
tabular environments of standard LaTeX, or their extended \
versions defined in array. If used in math-mode, blockarray \
acts like array, otherwise it acts like tabular. The package \
implements a new method of defining column types, and also \
block and block* environments, for specifying sub-arrays of the \
main array. What's more, the \\footnote command works inside a \
blockarray."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07svn77682"

RPM_NAME = "texlive-blkarray-2026.226.0.0.07svn77682-59.2.noarch.rpm"
RPM_HASH = "9639644decdd608a5319878ab112f43a19b64b6879875ba73ef24070c37bb0444a29a2b114945615192c4765090084f1703b8cdabad04a7a63de8141d9b344c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blkarray.sty \
texlive-blkarray"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.sty \
tex-doc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
