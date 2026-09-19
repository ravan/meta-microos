SUMMARY = "'Tabbing' front-end to stackengine"
DESCRIPTION = "The package provides a front end to the stackengine package, to \
allow tabbed stacking. In most cases, an existing stackengine \
command may be prepended with the word 'tabbed', 'align' or \
'tabular' to create a new tabbed version of a stacking macro. \
In addition, hooks in the package's parser that tabbed strings \
of data may be parsed, extracted, and reconstituted (not \
requiring use of any stacking constructions)."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.10svn46848"

RPM_NAME = "texlive-tabstackengine-2026.227.2.10svn46848-62.2.noarch.rpm"
RPM_HASH = "711d9aa1efbfa462cd1b09f653e2fd57fdcbdd8469732ec74ec0432fb9a2037b40cbf2b12a8d6a299f9c0d2661882d1239ca178c2f68b16f34ec2ece46cd434e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabstackengine.sty \
texlive-tabstackengine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-listofitems.sty \
tex-stackengine.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
