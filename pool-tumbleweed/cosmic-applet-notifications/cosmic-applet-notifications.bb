SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-notifications-1.0.14-1.3.noarch.rpm"
RPM_HASH = "311627a49c6a6608508d2380de953032fc2946241f80f87698144481663c893aa8fdb9a8dc01c964ecc02b0fc0586e9cbe40dc2475882e87ed4029832e113722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-notifications"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
