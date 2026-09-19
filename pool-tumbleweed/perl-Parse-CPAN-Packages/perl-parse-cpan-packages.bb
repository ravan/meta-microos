SUMMARY = "Parse 02packages.details.txt.gz"
DESCRIPTION = "The Comprehensive Perl Archive Network (CPAN) is a very useful collection \
of Perl code. It has several indices of the files that it hosts, including \
a file named '02packages.details.txt.gz' in the 'modules' directory. This \
file contains lots of useful information and this module provides a simple \
interface to the data contained within. \
 \
In a future release the Parse::CPAN::Packages::Package manpage and the \
Parse::CPAN::Packages::Distribution manpage might have more information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.40"

RPM_NAME = "perl-Parse-CPAN-Packages-2.40-1.41.noarch.rpm"
RPM_HASH = "87059d9140c39ddc8f2b51a699e36ad261ea23b71c3c3a6cd598ba5538d977d033972192914517766c28d73c39fc62481bd5a9c844757454bc0c9fe9066c4888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--CPAN--Packages \
perl-Parse--CPAN--Packages--Distribution \
perl-Parse--CPAN--Packages--Package \
perl-Parse-CPAN-Packages"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Archive--Peek \
perl-CPAN--DistnameInfo \
perl-Compress--Zlib \
perl-File--Slurp \
perl-Moo \
perl-PPI \
perl-Path--Class \
perl-Test--InDistDir \
perl-Type--Utils \
perl-Types--Standard \
perl-version"

inherit rpm
