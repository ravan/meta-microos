SUMMARY = "Construct prereq parameters of Module::Build from cpanfile"
DESCRIPTION = "This simple module reads cpanfile and converts its content into valid \
prereq parameters for 'new()' method of Module::Build. \
 \
Currently it does not support 'optional features' specification (See \
cpanfile/feature)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.20.0"

RPM_NAME = "perl-Module-Build-Prereqs-FromCPANfile-0.20.0-1.7.noarch.rpm"
RPM_HASH = "eaecfe00cd94908a81a48d2cf4c442e9513a658353fdaf6d60bdebaf570b7871e54fcc55bcfba116ee0678b820c0a0d961448dfec896256969f7c997adede5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Prereqs--FromCPANfile \
perl-Module-Build-Prereqs-FromCPANfile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta--Prereqs \
perl-Module--CPANfile \
perl-version"

inherit rpm
