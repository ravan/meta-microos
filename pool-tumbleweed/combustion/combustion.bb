SUMMARY = "System for initial configuration of appliances"
DESCRIPTION = "Combustion is a minimal module for dracut, which runs a user provided script on \
the first boot of a transactional system. \
 \
You can use this to create additional files, install packages, set up devices \
or even re-partition the hard disk. The configuration can be provided as a \
shell script, loaded from an external storage media and is run during boot in a \
new system snapshot. On success, the system will directly boot into that new \
snapshot, so that no reboot is needed."
LICENSE = "GPL-2.0-or-later"

PV = "1.5+git8"

RPM_NAME = "combustion-1.5+git8-1.3.noarch.rpm"
RPM_HASH = "9491e5404b3d5dd1b587b0f47ffdabdf4cf7851b12a49fa0872ca5a6e351cd3fe3397b4bd0ecd6acd806d27fb3a353afd64cc18291ff39e8027f357524cac9d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "combustion"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
awk"

inherit rpm
