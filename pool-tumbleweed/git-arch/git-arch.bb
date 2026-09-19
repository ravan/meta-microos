SUMMARY = "Git tools for importing Arch repositories"
DESCRIPTION = "Tools for importing GNU Arch repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-arch-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "62c43aae02233d9f27aac75edda7e1e1061ff71dcb577eec47df5ab12f926f068e9d823d810f6465aaae5f33990c17aec7185959cccfe4f62ec3ea2189a88aff"

RPROVIDES:${PN} += "git-arch"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core"

inherit rpm
