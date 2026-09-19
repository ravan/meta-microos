SUMMARY = "Extra control of appendices"
DESCRIPTION = "The appendix package provides various ways of formatting the \
titles of appendices. Also (sub)appendices environments are \
provided that can be used, for example, for per chapter/section \
appendices. The word 'Appendix' or similar can be prepended to \
the appendix number for article class documents. The word \
'Appendices' or similar can be added to the table of contents \
before the appendices are listed. The word 'Appendices' or \
similar can be typeset as a \\part-like heading (page) in the \
body. An appendices environment is provided which can be used \
instead of the \\appendix command."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2csvn78101"

RPM_NAME = "texlive-appendix-2026.226.1.2csvn78101-61.2.noarch.rpm"
RPM_HASH = "c475ca1b7906e49355e4014441d30d9f39fe5e926285cc382d9c2d9d0a7c5ce23f00e95aff37e92492dbf7a78bd551931e47e69794bae2689f4bdcaad8d9756b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-appendix.sty \
texlive-appendix"

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
