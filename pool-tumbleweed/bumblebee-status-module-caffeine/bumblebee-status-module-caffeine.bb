SUMMARY = "Widget for automatic screen locking"
DESCRIPTION = "Enable/disable automatic screen locking."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-caffeine-2.1.5-4.7.noarch.rpm"
RPM_HASH = "9c68fb02254f09b9f920d13b292c5dc5187b92b6e5d6f07c7a3074ba2c33211b5cf1e7633a829b1a8755be40aa3887ca85bdffa0f285217310538698122d40de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-caffeine"

RDEPENDS:${PN} += "bumblebee-status \
libnotify-tools \
xdotool \
xprop"

inherit rpm
