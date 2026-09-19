SUMMARY = "Common rules for searching for Perl things"
DESCRIPTION = "I write a lot of things that muck with Perl files. And it always annoyed me \
that finding 'perl files' requires a moderately complex File::Find::Rule \
pattern. \
 \
*File::Find::Rule::Perl* provides methods for finding various types \
Perl-related files, or replicating search queries run on a distribution in \
various parts of the CPAN ecosystem."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.16"

RPM_NAME = "perl-File-Find-Rule-Perl-1.16-1.22.noarch.rpm"
RPM_HASH = "244bc79eee33af9893f69e4d320342ca05fad173c0084b688700ec9cb40322bc2374cedfe9f69331f9bb4966865f87267496eda1202b3618faa84090b15bb93e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Find--Rule--Perl \
perl-File-Find-Rule-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Find--Rule \
perl-Params--Util \
perl-Parse--CPAN--Meta"

inherit rpm
