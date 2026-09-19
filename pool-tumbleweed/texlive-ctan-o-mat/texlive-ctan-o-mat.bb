SUMMARY = "Upload or validate a package for CTAN"
DESCRIPTION = "This program can be used to automate the upload of a package to \
CTAN. The description of the package is contained in a \
configuration file. The provided information is validated in \
any case. If the validation succeeds and not only the \
validation is requested, then the provided archive file will be \
placed in the incoming area of the CTAN for further processing \
by the CTAN team. In any case any finding during the validation \
is reported at the end of the processing. Note that the \
validation is the default and an official submission has to be \
requested by an appropriate command line option. ctan-o-mat \
requires an Internet connection to the CTAN server. Even the \
validation retrieves the known attributes and the basic \
constraints from the server."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.2svn51578"

RPM_NAME = "texlive-ctan-o-mat-2026.226.1.2svn51578-61.2.noarch.rpm"
RPM_HASH = "a4df74858e0d599484876fad563ee48c14cbb2284a089c5d9717230fd99b153212c91980d642a7e43ba20140a90640f16ba4a76dd722930aa43c9c6413b03574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctan-o-mat"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-Data--Dumper \
perl-File--Basename \
perl-FileHandle \
perl-Getopt--Long \
perl-HTTP--Request--Common \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Pod--Text \
perl-constant \
perl-strict \
sed \
texlive \
texlive-ctan-o-mat-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
