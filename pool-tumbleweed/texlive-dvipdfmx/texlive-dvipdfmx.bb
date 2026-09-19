SUMMARY = "An extended version of dvipdfm"
DESCRIPTION = "Dvipdfmx (formerly dvipdfm-cjk) is a development of dvipdfm \
created to support multi-byte character encodings and large \
character sets for East Asian languages. Dvipdfmx, if 'called' \
with the name dvipdfm, operates in a 'dvipdfm compatibility' \
mode, so that users of the both packages need only keep one \
executable. A secondary design goal is to support as many 'PDF' \
features as does pdfTeX. The current version of the package is \
no longer maintained on CTAN as a separate entity; development \
now takes place within the TeX Live framework, and it is no \
longer available as a separate package. For download, support, \
and other information, please see TeX Live. However, the \
information on this page is maintained and should be current."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77942"

RPM_NAME = "texlive-dvipdfmx-2026.226.svn77942-61.4.noarch.rpm"
RPM_HASH = "8b017571a841dd2b56f49acaeb432dbf7179bd119db0a3a4b7aca27ff1b70111ee4ee349d6f136da5f57251de1495a1d411511dc953359c6d935b7273dc84d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-dvipdfmx \
tex-cid-x.map \
tex-ckx.map \
tex-dvipdfmx-unsafe.cfg \
tex-dvipdfmx.cfg \
texlive-dvipdfm \
texlive-dvipdfmx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
ghostscript \
grep \
perl \
perl-TeXLive--TLUtils \
sed \
tex-texmf.cnf \
texlive \
texlive-dvipdfmx-bin \
texlive-extractbb \
texlive-filesystem \
texlive-glyphlist \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-scripts-extra \
texlive-texlive.infra"

inherit rpm
