SUMMARY = "Generate Kwalitee ratings for a distribution"
DESCRIPTION = "Generate Kwalitee ratings for a distribution"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.30.0"

RPM_NAME = "perl-Module-CPANTS-Analyse-1.30.0-1.3.noarch.rpm"
RPM_HASH = "5651b84d715ba3d7f86b13f476cd23e3da4129d22ec80bb6d9f945fcd52aabfda7cef4b0567c6ca77f33816d217da0231defd15cf2794c6e1336622214196fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--CPANTS--Analyse \
perl-Module--CPANTS--Kwalitee \
perl-Module--CPANTS--Kwalitee--BrokenInstaller \
perl-Module--CPANTS--Kwalitee--CpantsErrors \
perl-Module--CPANTS--Kwalitee--Distname \
perl-Module--CPANTS--Kwalitee--Distros \
perl-Module--CPANTS--Kwalitee--Files \
perl-Module--CPANTS--Kwalitee--FindModules \
perl-Module--CPANTS--Kwalitee--License \
perl-Module--CPANTS--Kwalitee--Manifest \
perl-Module--CPANTS--Kwalitee--MetaYML \
perl-Module--CPANTS--Kwalitee--NeedsCompiler \
perl-Module--CPANTS--Kwalitee--Pod \
perl-Module--CPANTS--Kwalitee--Prereq \
perl-Module--CPANTS--Kwalitee--Repackageable \
perl-Module--CPANTS--Kwalitee--Signature \
perl-Module--CPANTS--Kwalitee--Uses \
perl-Module--CPANTS--Kwalitee--Version \
perl-Module-CPANTS-Analyse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Archive--Any--Lite \
perl-Archive--Tar \
perl-Array--Diff \
perl-CPAN--Meta--Validator \
perl-CPAN--Meta--YAML \
perl-Class--Accessor \
perl-Data--Binary \
perl-File--Find--Object \
perl-JSON--PP \
perl-List--Util \
perl-Module--Find \
perl-Parse--Distname \
perl-Perl--PrereqScanner--NotQuiteLite \
perl-Software--License \
perl-version"

inherit rpm
