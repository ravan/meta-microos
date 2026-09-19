SUMMARY = "Standalone, extensible Perl module installer"
DESCRIPTION = "*Module::Install* is a package for writing installers for CPAN (or \
CPAN-like) distributions that are clean, simple, minimalist, act in a \
strictly correct manner with ExtUtils::MakeMaker, and will run on any Perl \
installation version 5.005 or newer. \
 \
The intent is to make it as easy as possible for CPAN authors (and \
especially for first-time CPAN authors) to have installers that follow all \
the best practices for distribution installation, but involve as much DWIM \
(Do What I Mean) as possible when writing them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.21"

RPM_NAME = "perl-Module-Install-1.21-1.17.noarch.rpm"
RPM_HASH = "42f43c660133c31da6998614d13e5ebfac3aea65e5e10c6d052a4946e0da4b147b3e6a5f80ee0fae1398bda69e745040345fc3e247871230cd9c7955946dd93c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--AutoInstall \
perl-Module--Install \
perl-Module--Install--Admin \
perl-Module--Install--Admin--Bundle \
perl-Module--Install--Admin--Compiler \
perl-Module--Install--Admin--Find \
perl-Module--Install--Admin--Include \
perl-Module--Install--Admin--Makefile \
perl-Module--Install--Admin--Manifest \
perl-Module--Install--Admin--Metadata \
perl-Module--Install--Admin--ScanDeps \
perl-Module--Install--Admin--WriteAll \
perl-Module--Install--AutoInstall \
perl-Module--Install--Base \
perl-Module--Install--Base--FakeAdmin \
perl-Module--Install--Bundle \
perl-Module--Install--Can \
perl-Module--Install--Compiler \
perl-Module--Install--Deprecated \
perl-Module--Install--External \
perl-Module--Install--Fetch \
perl-Module--Install--Include \
perl-Module--Install--Inline \
perl-Module--Install--MakeMaker \
perl-Module--Install--Makefile \
perl-Module--Install--Metadata \
perl-Module--Install--PAR \
perl-Module--Install--Run \
perl-Module--Install--Scripts \
perl-Module--Install--Share \
perl-Module--Install--Win32 \
perl-Module--Install--With \
perl-Module--Install--WriteAll \
perl-Module-Install \
perl-inc--Module--Install"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--PPPort \
perl-ExtUtils--Install \
perl-ExtUtils--MakeMaker \
perl-ExtUtils--ParseXS \
perl-File--Remove \
perl-File--Spec \
perl-Module--Build \
perl-Module--CoreList \
perl-Module--ScanDeps \
perl-Parse--CPAN--Meta \
perl-YAML--Tiny"

inherit rpm
