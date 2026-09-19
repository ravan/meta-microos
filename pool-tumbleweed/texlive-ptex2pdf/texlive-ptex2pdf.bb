SUMMARY = "Convert Japanese TeX documents to PDF"
DESCRIPTION = "The Lua script provides system-independent support of Japanese \
typesetting engines in TeXworks. As TeXworks typesetting setup \
does not allow for multistep processing, this script runs one \
of the ptex-based programs (ptex, uptex, eptex, platex, \
uplatex) followed by dvipdfmx."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-2026.226.20200520.0svn65953-60.4.noarch.rpm"
RPM_HASH = "dbffdefeee131ecb95255412c3938d32550a77adafa1fee5039070dc12732135f2fb56b6ea790c4d8eb94c4b07dec99315e6290c773ec006033c33608a0c305f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex2pdf"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
perl \
perl-TeXLive--TLUtils \
sed \
tex-texmf.cnf \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ptex2pdf-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlive.infra"

inherit rpm
