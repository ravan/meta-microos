SUMMARY = "Tools to simplify using fonts (especially TT/OTF ones)"
DESCRIPTION = "This package provides tools to simplify using OpenType fonts \
with LaTeX. By far the most important program in this bundle is \
autoinst: autoinst - a wrapper script around Eddie Kohler's \
LCDF TypeTools. Autoinst aims to automate the installation of \
OpenType fonts in LaTeX by calling the LCDF TypeTools (with the \
correct options) for all fonts you wish to install, and \
generating the necessary .fd and .sty files. In addition, this \
bundle contains a few other, less important utilities: afm2afm \
- re-encode .afm files, ot2kpx - extract kerning pairs from \
OpenType fonts, splitttc - split an OpenType Collection file \
(ttc or otc) into individual fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77722"

RPM_NAME = "texlive-fontools-2026.226.svn77722-60.2.noarch.rpm"
RPM_HASH = "a1008f521c0fbe1a3b99c18b8647cf13d58a3af7a34ed3eb74149994b90130176f80a063b8740f69a473ea9f03cd147e1a022d02e35996c0be816b272308b92a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontools-cs.enc \
tex-fontools-l7x.enc \
tex-fontools-lgr.enc \
tex-fontools-ly1.enc \
tex-fontools-oml.enc \
tex-fontools-ot1.enc \
tex-fontools-qx.enc \
tex-fontools-t1.enc \
tex-fontools-t2a.enc \
tex-fontools-t2b.enc \
tex-fontools-t2c.enc \
tex-fontools-t3.enc \
tex-fontools-t4.enc \
tex-fontools-t5.enc \
tex-fontools-ts1.enc \
tex-fontools-ts3.enc \
texlive-fontools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Path \
perl-File--Spec \
perl-Getopt--Long \
perl-List--Util \
perl-POSIX \
perl-Pod--Usage \
perl-integer \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-fontools-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
