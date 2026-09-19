SUMMARY = "LaTeX package options with pgfkeys"
DESCRIPTION = "The pgfkeys package (part of the pgf distribution) is a \
well-designed way of defining and using large numbers of keys \
for key-value syntaxes. However, pgfkeys itself does not offer \
means of handling LaTeX class and package options. This package \
adds such option handling to pgfkeys, in the same way that \
kvoptions adds the same facility to the LaTeX standard keyval \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1asvn77682"

RPM_NAME = "texlive-pgfopts-2026.226.2.1asvn77682-58.2.noarch.rpm"
RPM_HASH = "c4bc64dfa9543b427f66e8891b7ee123d555a142a3c160f6921e0be90c5de9a8de4c5ef2e8465295aa7f358e57e92b42a6ef7e8e4edb804d8a12da4d152e2db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfopts.sty \
texlive-pgfopts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
