SUMMARY = "Restart behavior configuration for dbus-broker - Allow restarting"
DESCRIPTION = "This package configures how the service behave to the systemctl restart command. \
 \
By installing this package dbus-broker will be allowed to restart"
LICENSE = "Apache-2.0"

PV = "37"

RPM_NAME = "dbus-broker-allow-restart-37-2.4.noarch.rpm"
RPM_HASH = "5bee97acc3eb12101dadd04b32cd82c35b3f8c0dabf190fcbd9de1a6492792ed4abbf091e2b5a29907df4dff5e5ddc32e938af04106a621df282ec501214c491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-broker-allow-restart \
dbus-broker-restart-behavior"

RDEPENDS:${PN} += ""

inherit rpm
