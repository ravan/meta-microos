SUMMARY = "Get, unpack, build and install modules from CPAN"
DESCRIPTION = "cpanminus is a script to get, unpack, build and install modules from CPAN \
and does nothing else. \
 \
It's dependency free (can bootstrap itself), requires zero configuration, \
and stands alone. When running, it requires only 10MB of RAM."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.7049"

RPM_NAME = "perl-App-cpanminus-1.7049-1.3.noarch.rpm"
RPM_HASH = "b2d088417862bfd6de28e113868c5770157bea42b0ce5336c839f20e1126f2860667b590b7ec33d35b9a6c35169d5a30e76f366a571e659a17ad65197a63a7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpanm \
perl-App--cpanminus \
perl-App--cpanminus--Dependency \
perl-App--cpanminus--fatscript \
perl-App--cpanminus--script \
perl-App-cpanminus \
perl-ModuleBuildSkipMan"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--DistnameInfo \
perl-CPAN--Meta \
perl-CPAN--Meta--Check \
perl-CPAN--Meta--Prereqs \
perl-CPAN--Meta--YAML \
perl-Digest--SHA \
perl-ExtUtils--Install \
perl-ExtUtils--MakeMaker \
perl-ExtUtils--Manifest \
perl-File--pushd \
perl-HTTP--Tiny \
perl-Module--Build \
perl-Module--CPANfile \
perl-Module--CoreList \
perl-Module--Metadata \
perl-Parse--PMFile \
perl-String--ShellQuote \
perl-YAML \
perl-local--lib"

inherit rpm
