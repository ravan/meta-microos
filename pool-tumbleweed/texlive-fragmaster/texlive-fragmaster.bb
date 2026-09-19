SUMMARY = "Using psfrag with pdfLaTeX"
DESCRIPTION = "Fragmaster enables you to use psfrag with pdfLaTeX. It takes \
EPS files and psfrag substitution definition files, and \
produces PDF and EPS files with the substitutions included."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn26313"

RPM_NAME = "texlive-fragmaster-2026.226.1.6svn26313-60.2.noarch.rpm"
RPM_HASH = "66dfa2fd98ffd0767bc616aeccbaa820a53488f9bf22bc428a610db39c1fb0ea900e12ca5f032340b36804e5e346d723d7c6ed4a8690384462beeddbb02485fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fragmaster"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Temp \
perl-Pod--Usage \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-fragmaster-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
