SUMMARY = "Resources for the ownCloud client and desktop shell integrations"
DESCRIPTION = " \
This package provides resources like icons for the ownCloud client and the shell integrations"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "owncloud-extensions-resources-1.0.0-1.6.aarch64.rpm"
RPM_HASH = "2b837b9b886821ca9483187563c85784614292f7418cc077b348ed3049612037f9112fca3fb5e3cab7860588d656dee9d51c08feca0b0548fbd3728e46676f5f"

RPROVIDES:${PN} += "cmake-ownCloudShellResources \
owncloud-extensions-resources \
owncloud-icons"

RDEPENDS:${PN} += ""

inherit rpm
