SUMMARY = "Validate your CPAN META.yml files"
DESCRIPTION = "This distribution was written to ensure that a META.yml file, provided with \
a standard distribution uploaded to CPAN, meets the specifications that are \
slowly being introduced to module uploads, via the use of package makers \
and installers such as the ExtUtils::MakeMaker manpage, the Module::Build \
manpage and the Module::Install manpage. \
 \
See the CPAN::Meta manpage for further details of the CPAN Meta \
Specification."
LICENSE = "Artistic-2.0"

PV = "0.25"

RPM_NAME = "perl-Test-CPAN-Meta-0.25-2.30.noarch.rpm"
RPM_HASH = "4cbede181a96e0efa0fe4f909b443ed21d2fe5a3a52862055a4d4fd85fe27f02ac66f7920f0db10a3e9e3cf00488ef24b38955fa7915ee941d6911fda639558e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CPAN--Meta \
perl-Test--CPAN--Meta--Version \
perl-Test-CPAN-Meta"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Parse--CPAN--Meta \
perl-Test--More"

inherit rpm
