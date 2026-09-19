SUMMARY = "A short guide to using LaTeX2e to typeset high quality documents"
DESCRIPTION = "This document is a short guide to using LaTeX2e to typeset high \
quality documents. It focuses on users of Windows and guides \
the reader through installation, some of LaTeX's conventions, \
and creating the front matter, body and end matter. The \
appendices contain a list of useful facilities not otherwise \
covered in this document and a list of helpful resources."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.1.3.2svn77842"

RPM_NAME = "texlive-yet-another-guide-latex2e-2026.226.1.3.2svn77842-59.4.noarch.rpm"
RPM_HASH = "017ea72bfaa4417a5cf06625839eccbded7419b0764996e0dcf36a3395e3a46212bab5b88de911c8ffad1b4e05561b362467dd4cc19f5bc00a0068bad364c67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yet-another-guide-latex2e"

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
