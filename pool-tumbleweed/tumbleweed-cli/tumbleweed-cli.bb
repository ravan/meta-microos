SUMMARY = "Command line interface for interacting with tumbleweed snapshots"
DESCRIPTION = "tumbleweed-cli provides a command line interface for interacting with tumbleweed \
snapshots."
LICENSE = "GPL-2.0-only"

PV = "0.3.4"

RPM_NAME = "tumbleweed-cli-0.3.4-1.10.noarch.rpm"
RPM_HASH = "ebddd83a297a315f1282cdf147415c2b9146a5a51c723363b41be1a16abda73050af449c1171850d2c4d69085e2d4f92908e4c21d8a2d748d4057704a2703661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tumbleweed-cli"

RDEPENDS:${PN} += "/usr/bin/env \
coreutils \
curl \
grep \
libzypp-repovarexpand \
sudo \
zypper"

inherit rpm
