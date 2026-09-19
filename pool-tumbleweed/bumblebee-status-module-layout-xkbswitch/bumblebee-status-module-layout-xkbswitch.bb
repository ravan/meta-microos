SUMMARY = "Widget to show and switch keyboard layout"
DESCRIPTION = "Widget to show and switch keyboard layout."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-layout-xkbswitch-2.1.5-4.7.noarch.rpm"
RPM_HASH = "6a903fa24151407ffe9366a4534fa53b0afe870d18193f0d5241119e9949b1f5d23f34d89cc43a3c3e39234518031b144d7d9e2f295520ff6e5811f9014f7b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-layout-xkbswitch"

RDEPENDS:${PN} += "bumblebee-status \
xkb-switch"

inherit rpm
