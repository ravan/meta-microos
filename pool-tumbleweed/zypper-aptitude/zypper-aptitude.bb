SUMMARY = "aptitude compatibility with zypper"
DESCRIPTION = "provides compatibility to Debian's aptitude command using zypper"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.101"

RPM_NAME = "zypper-aptitude-1.14.101-1.1.noarch.rpm"
RPM_HASH = "2b4e29ac990057758b35f55ce56b6f6141c90ec5967bc6410318c50d093c46a26272e281278f232451902c05f8c2cf6f40bd87450b308ee1252ad396236f2d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-zypper-aptitude \
zypper-aptitude"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
zypper"

inherit rpm
