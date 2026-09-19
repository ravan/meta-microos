SUMMARY = "Upstream configuration for the PackageKit installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less. \
 \
This package provides the upstream default configuration for PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "PackageKit-branding-upstream-1.3.6-2.1.noarch.rpm"
RPM_HASH = "05b4f62611708fbbd71f7b87130cf0e89763d58bd26ddff52cbd6b28460d70d12f95c941b77422ef0b2a1fd1cac370793df2c83494a6800f34870ff8105920b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PackageKit-branding \
PackageKit-branding-upstream \
config-PackageKit-branding-upstream"

RDEPENDS:${PN} += "PackageKit"

inherit rpm
