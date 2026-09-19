SUMMARY = "'European' versions of standard classes"
DESCRIPTION = "The bundle offers versions of the standard LaTeX article and \
report classes, rewritten to reflect a more European design, \
and the a4 package, which is better tuned to the shape of a4 \
paper than is the a4paper class option of the standard classes. \
The classes include several for article and report \
requirements, and a letter class. The elements of the bundle \
were designed by members of the Dutch TeX Users Group NTG."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1hsvn77239"

RPM_NAME = "texlive-ntgclass-2026.226.2.1hsvn77239-61.2.noarch.rpm"
RPM_HASH = "4dee74a35d81d5a5b2898f67c598eceb186b24aa06dde43100a9ecd0b4a3877368b7ea5f10dda148adf6913306623a70e8b5ce10eaa6d44c10e723be331d1cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a4.sty \
tex-artikel1.cls \
tex-artikel2.cls \
tex-artikel3.cls \
tex-boek.cls \
tex-boek3.cls \
tex-brief.cls \
tex-ntg10.clo \
tex-ntg11.clo \
tex-ntg12.clo \
tex-rapport1.cls \
tex-rapport3.cls \
texlive-ntgclass"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
