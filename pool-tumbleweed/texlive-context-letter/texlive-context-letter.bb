SUMMARY = "ConTeXt package for writing letters"
DESCRIPTION = "A means of writing 'vanilla' letters and memos is provided, \
with support covering ConTeXt Mkii and Mkiv. The design of \
letters may be amended by a wide range of style specifications."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77841"

RPM_NAME = "texlive-context-letter-2026.226.svn77841-61.2.noarch.rpm"
RPM_HASH = "0bc1f8e3392bdacc5085009a945df6c8824891a7cbaa47154f89eae443cef812e110e6240fc8282b80c7edd16e64f07b0e90fa0c499ed9d195829ddc38602ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-letter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
