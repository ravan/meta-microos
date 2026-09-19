SUMMARY = "A zypp signature check plugin for verifying pqc repository signatures"
DESCRIPTION = "This package contains a plugin for zypp that allows the verification \
of post-quantum repository signatures. \
 \
The check can be enabled by adding 'repo_sigcheck_plugin=pqcverification' \
to the repository configuration"
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "pqcverification-zypp-plugin-1.0-1.2.noarch.rpm"
RPM_HASH = "752b5576f4f5ec8e70366bf6549b4581fef67a581a9e5c8de8a68276da89ce3cd60ea7aec5b5f507a94e1cc145f37b0145080522673724db64083bd7df60d41a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pqcverification-zypp-plugin"

RDEPENDS:${PN} += "/usr/bin/perl \
openssl"

inherit rpm
