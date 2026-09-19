SUMMARY = "Cpanfile support for EUMM"
DESCRIPTION = "ExtUtils::MakeMaker::CPANfile loads 'cpanfile' in your distribution and \
modifies parameters for 'WriteMakefile' in your Makefile.PL. Just use it \
instead of ExtUtils::MakeMaker (which should be loaded internally), and \
prepare 'cpanfile'. \
 \
As of version 0.03, ExtUtils::MakeMaker::CPANfile also removes \
WriteMakefile parameters that the installed version of ExtUtils::MakeMaker \
doesn't know, to avoid warnings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.110.0"

RPM_NAME = "perl-ExtUtils-MakeMaker-CPANfile-0.110.0-1.1.noarch.rpm"
RPM_HASH = "b6512c5e83c4a66ebeb504ed8112827f6b2bab98b4a75c9e38c3cac8c62dbd2e40139a28fc1be9911bb5e8b8921e9677f5aa01381c3953d255a8c7a7a45565fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--MakeMaker--CPANfile \
perl-ExtUtils-MakeMaker-CPANfile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta--Converter \
perl-Module--CPANfile \
perl-Test--More \
perl-version"

inherit rpm
