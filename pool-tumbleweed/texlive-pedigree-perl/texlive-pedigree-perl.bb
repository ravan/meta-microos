SUMMARY = "Generate TeX pedigree files from CSV files"
DESCRIPTION = "This program generates TeX commands to typeset pedigrees -- \
either TeX fragments or full LaTeX files, to be processed by \
the authors' pst-pdgr package. The program has support for \
multilanguage pedigrees (at the present moment the English and \
Russian languages are supported)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1svn64227"

RPM_NAME = "texlive-pedigree-perl-2026.226.2.1svn64227-58.2.noarch.rpm"
RPM_HASH = "da4928a93e4e5a6c15814a21df47f9459fe8494adca1dd4aaa70cbc6907374f1cbe82a71b5aa56b758794095689542393b5f822a024602c69eaedd930e08790c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pedigree \
perl-Pedigree--AbortionNode \
perl-Pedigree--Area \
perl-Pedigree--ChildlessNode \
perl-Pedigree--Language \
perl-Pedigree--MarriageNode \
perl-Pedigree--Node \
perl-Pedigree--Parser \
perl-Pedigree--PersonNode \
perl-Pedigree--TwinsNode \
texlive-pedigree-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-FileHandle \
perl-Getopt--Std \
perl-strict \
perl-vars \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pedigree-perl-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
