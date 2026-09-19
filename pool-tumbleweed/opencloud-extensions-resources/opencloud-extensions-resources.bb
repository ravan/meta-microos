SUMMARY = "Resources for the OpenCloud client and desktop shell integrations"
DESCRIPTION = " \
This package provides resources like icons for the OpenCloud client and the shell integrations"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "opencloud-extensions-resources-1.0.0-1.4.aarch64.rpm"
RPM_HASH = "83d7705b3b8539dfdb607903537ecdc5c50dbc758fad64906994b5804471335b7fdd60a2b60fd2f7e6dd5d2b8ecfde774c05b996232c741bd9011ae8d0687d97"

RPROVIDES:${PN} += "cmake-OpenCloudShellResources \
opencloud-extensions-resources"

RDEPENDS:${PN} += ""

inherit rpm
