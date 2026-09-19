SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-time-1.0.14-1.3.noarch.rpm"
RPM_HASH = "0bae85605c132be72c417684f1e3a36699df5996628636deadff0cffba8d7779466a56136c1e979adefa9b3436952bcea8b617b0e5e16728ff72eb46d106c0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-time"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
