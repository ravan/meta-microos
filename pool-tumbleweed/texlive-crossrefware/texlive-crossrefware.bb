SUMMARY = "Scripts for working with crossref.org"
DESCRIPTION = "This bundle contains the following scripts: bibdoiadd.pl: add \
DOI numbers to papers in a given bib file, bibzbladd.pl: add \
Zbl numbers to papers in a given bib file, bibmradd.pl: add MR \
numbers to papers in a given bib file, bbl2bib.pl: convert \
thebibliography environment to a bib file, biburl2doi.pl: \
convert urls pointing to doi.org to dois ltx2crossrefxml.pl: a \
tool for the creation of XML files for submitting to \
crossref.org. The scripts use bibtexperllibs."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76407"

RPM_NAME = "texlive-crossrefware-2026.226.svn76407-61.2.noarch.rpm"
RPM_HASH = "d530cad06371e3095bf51567dcd280084abbda9e5ce12d9e6041580a3189d5e92f7a94b4b6275eb2a1599e2bde9f00e55516df783cbf652af922c206e740e036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibdoiadd.cfg \
tex-ltx2crossrefxml.cfg \
texlive-crossrefware"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-BibTeX--Parser \
perl-BibTeX--Parser--Author \
perl-Cwd \
perl-File--Basename \
perl-File--Spec \
perl-FileHandle \
perl-Getopt--Long \
perl-Getopt--Std \
perl-IO--File \
perl-JSON \
perl-LWP--Simple \
perl-LWP--UserAgent \
perl-LaTeX--ToUnicode \
perl-POSIX \
perl-URI--Escape \
perl-strict \
perl-utf8 \
perl-warnings \
sed \
texlive \
texlive-crossrefware-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
