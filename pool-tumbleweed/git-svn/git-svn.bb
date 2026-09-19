SUMMARY = "Git tools for importing Subversion repositories"
DESCRIPTION = "Tools for importing Subversion repositories to the Git version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-svn-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "37e5c785132ad98b1149794cd3b3d8a8cdd1e7d50dfe67195cdb5eac6c8ca8ae1ccecafc1bd35ecebdd6e2fc80abc0a5e9f69a79bd89489127536b6b156ab1c9"

RPROVIDES:${PN} += "git-svn"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl-Git \
perl-Term-ReadKey \
subversion \
subversion-perl"

inherit rpm
