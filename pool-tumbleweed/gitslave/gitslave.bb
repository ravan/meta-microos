SUMMARY = "Creates a group of related repositories"
DESCRIPTION = "Creates a group of related repositories—a superproject repository and \
a number of slave repositories—all of which are concurrently developed on and \
on which all git operations should normally operate; so when you branch, each \
repository in the project is branched in turn."
LICENSE = "SUSE-Gitslave"

PV = "2.0.2"

RPM_NAME = "gitslave-2.0.2-10.8.noarch.rpm"
RPM_HASH = "04301b6a0f6139fdbda6dad041c36985f6b24ca55026f5a2d0adce9b6b530dfff4f7b6f8a954c795f0f5975d754d96f697c88ebc7701a87697a5ef5da2adc1f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitslave"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl"

inherit rpm
