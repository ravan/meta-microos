SUMMARY = "A class for making curriculum vitae"
DESCRIPTION = "CurVe is a class for writing a CV, with configuration for the \
language in which you write. The class provides a set of \
commands to create rubrics, entries in these rubrics etc. CurVe \
then format the CV (possibly splitting it onto multiple pages, \
repeating the titles etc), which is usually the most painful \
part of CV writing. Another nice feature of CurVe is its \
ability to manage different CV 'flavours' simultaneously. It is \
often the case that you want to maintain slightly divergent \
versions of your CV at the same time, in order to emphasize on \
different aspects of your background. CurVe also comes with \
support for use with AUC-TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.16svn20745"

RPM_NAME = "texlive-curve-2026.226.1.16svn20745-61.2.noarch.rpm"
RPM_HASH = "c65965bd00f69acdd3f8da0e168febbb3e0646affd0343d0d63155b10f8134c3176312c88b7c57763b1d6bd7191d7775e299cd06da3b265aed74d8a8ab3f52cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-curve.cls \
texlive-curve"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-filehook.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-ltxtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
