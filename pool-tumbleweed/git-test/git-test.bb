SUMMARY = "Git extension to conveniently test all distinct versions"
DESCRIPTION = "Run tests on each distinct tree in a revision list, skipping versions whose \
contents have already been tested."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "git-test-1.0.4-1.16.noarch.rpm"
RPM_HASH = "7bcc97a6592f06981911a21532c48bb7eaf92d65298da46b99c779a6bead5ae2acec71dd843dc957d83fd19854325ddacd8a6ac2687a9c52a1a77091d69374c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-test"

RDEPENDS:${PN} += "/usr/bin/bash \
git-core"

inherit rpm
