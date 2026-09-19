SUMMARY = "A set of macros for various transformations of TeX boxes"
DESCRIPTION = "pdf-trans is a set of macros offering various transformations \
of TeX boxes (based on plain and pdfeTeX primitives). It was \
initially inspired by trans.tex, remade to work with pdfTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.4svn32809"

RPM_NAME = "texlive-pdf-trans-2026.226.2.4svn32809-58.2.noarch.rpm"
RPM_HASH = "2602da5e574883f75a9673879fe55e7c324b06532e503984ba2f2e34a25d6024bacd1d753ceb8c80084662e6f887a68e5c4a1f4db6ea436a25edbfadab8f4e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdf-trans.tex \
texlive-pdf-trans"

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
