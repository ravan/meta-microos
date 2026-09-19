SUMMARY = "Restart behavior configuration for dbus-broker - Block restarting"
DESCRIPTION = "This package configures how the service behave to the systemctl restart command. \
 \
By installing this package dbus-broker will be blocked to restart"
LICENSE = "Apache-2.0"

PV = "37"

RPM_NAME = "dbus-broker-block-restart-37-2.4.noarch.rpm"
RPM_HASH = "fb0ed5485cba620cb5d6820739620c34f842b965f8545ff8ff80a4ac43d6957464d81e8758eed72c4bae73eb62c3e3b76b4be1edd4dbcbb81a216d667afb879d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-broker-block-restart \
dbus-broker-restart-behavior"

RDEPENDS:${PN} += ""

inherit rpm
