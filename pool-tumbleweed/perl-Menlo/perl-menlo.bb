SUMMARY = "CPAN client"
DESCRIPTION = "Menlo is a backend for _cpanm 2.0_, developed with the goal to replace \
cpanm internals with a set of modules that are more flexible, extensible \
and easier to use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.9019"

RPM_NAME = "perl-Menlo-1.9019-2.12.noarch.rpm"
RPM_HASH = "40bd6c30f37adf1d33a36c9b475af57b82868da66c701ec40b11e9bac5c1ed82514a209804ace11cacdc467287daed1f1a0afdfedd837ab5b72e99ccd1765be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Menlo \
perl-Menlo--Builder--Static \
perl-Menlo--Dependency \
perl-Menlo--Index--MetaCPAN \
perl-Menlo--Index--MetaDB \
perl-Menlo--Index--Mirror \
perl-Menlo--Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Common--Index \
perl-CPAN--DistnameInfo \
perl-CPAN--Meta \
perl-CPAN--Meta--Check \
perl-CPAN--Meta--Requirements \
perl-CPAN--Meta--YAML \
perl-Capture--Tiny \
perl-Class--Tiny \
perl-ExtUtils--Config \
perl-ExtUtils--Helpers \
perl-ExtUtils--InstallPaths \
perl-File--Which \
perl-File--pushd \
perl-Getopt--Long \
perl-HTTP--Tiny \
perl-HTTP--Tinyish \
perl-JSON--PP \
perl-Module--CPANfile \
perl-Module--CoreList \
perl-Module--Metadata \
perl-Parse--CPAN--Meta \
perl-Parse--PMFile \
perl-String--ShellQuote \
perl-URI \
perl-local--lib \
perl-parent \
perl-version"

inherit rpm
