SUMMARY = "Simple software installation management software -- openSUSE default configuration"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less. \
 \
This package provides the openSUSE default configuration for \
PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "PackageKit-branding-openSUSE-42.1-3.22.noarch.rpm"
RPM_HASH = "3d48bfd3b106c66927c90876501c059177cd2af80226ff6e4db900e7cae87f2170f6acc0bdae4d131444729b695e767b419459499e6b94119528402c48f9250e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PackageKit-branding \
PackageKit-branding-openSUSE \
config-PackageKit-branding-openSUSE"

RDEPENDS:${PN} += "PackageKit"

inherit rpm
