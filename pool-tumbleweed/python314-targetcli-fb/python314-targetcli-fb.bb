SUMMARY = "A command shell for managing the Linux LIO kernel target"
DESCRIPTION = "targetcli-fb is a command-line interface for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. \
 \
targetcli-fb is a fork of the 'targetcli' code written by RisingTide Systems. \
The '-fb' differentiates between the original and this version. Please ensure \
to use either all 'fb' versions of the targetcli components -- targetcli, \
rtslib, and configshell, or stick with all non-fb versions, since they are \
no longer strictly compatible."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "python314-targetcli-fb-3.0.1-2.6.noarch.rpm"
RPM_HASH = "5f3c65a26bfd50149fc601c2d38cb171f25542fc9239f9c8ea340dc6da8d899e4856f1ac7091715f9d5bc09340ad171453366cadc216a5c995a9b2d5c6143221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-targetcli \
python314-targetcli-fb \
python3dist-targetcli \
targetcli \
targetcli-fb"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-configshell-fb \
python314-dbus-python \
python314-gobject \
python314-rtslib-fb \
targetcli-fb-common"

inherit rpm
