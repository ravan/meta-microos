SUMMARY = "BibTeX Perl Libraries"
DESCRIPTION = "This package provides BibTeX related Perl libraries by Gerhard \
Gossen, repacked by Boris Veytsman, for TeX Live and other \
TDS-compliant distributions. The libraries are written in pure \
Perl, so should work out of the box on any architecture. They \
have been packaged here mostly for Boris Veytsman's BibTeX \
suite, but can be used in any other Perl script."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.93svn76255"

RPM_NAME = "texlive-bibtexperllibs-2026.226.1.93svn76255-61.2.noarch.rpm"
RPM_HASH = "f6f26d69d4cbfb26c159ba35af44a4c3b10554d143947e67d48cc3362c808d9fb561fdc3ac51bb9bd8dfc41767b3418dfee181c2eda899c59037eb0a4872ae59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-BibTeX--Parser \
perl-BibTeX--Parser--Author \
perl-BibTeX--Parser--Entry \
perl-LaTeX--ToUnicode \
perl-LaTeX--ToUnicode--Tables \
texlive-bibtexperllibs"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-BibTeX--Parser \
perl-BibTeX--Parser--Author \
perl-BibTeX--Parser--Entry \
perl-Cwd \
perl-Encode \
perl-Exporter \
perl-File--Basename \
perl-File--Spec \
perl-Getopt--Long \
perl-LaTeX--ToUnicode \
perl-LaTeX--ToUnicode--Tables \
perl-strict \
perl-utf8 \
perl-warnings \
sed \
texlive \
texlive-bibtexperllibs-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
