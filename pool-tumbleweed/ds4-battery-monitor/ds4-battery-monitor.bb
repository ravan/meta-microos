SUMMARY = "DualShock 4 battery monitor tray icon"
DESCRIPTION = "A lightweight UDP-based battery monitor for DualShock 4 controllers \
with support for multiple devices and dynamic tray icons."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ds4-battery-monitor-0.1.2-1.2.noarch.rpm"
RPM_HASH = "f0ae996d3d618d5ea217750b41ae6025706aa60c9fb30f14dbb9d114b681b23bcff3b6775feb4ace6b6bddee5d70f7b4a9490b4d5fca9028d3e44b0e3d585657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ds4-battery-monitor"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
