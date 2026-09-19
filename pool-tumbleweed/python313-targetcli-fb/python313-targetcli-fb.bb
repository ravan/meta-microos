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

RPM_NAME = "python313-targetcli-fb-3.0.1-2.6.noarch.rpm"
RPM_HASH = "961137ad4e5310607916562e6bcbd7f69010bb3b38df4a070dea7cc634df488c378656f7c4e9cd870583408ae812324f5267df5b0fd2db4bfbbe2b752ce7d9b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-targetcli-fb \
python3.13dist-targetcli \
python313-targetcli-fb \
python3dist-targetcli \
targetcli \
targetcli-fb"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-configshell-fb \
python313-dbus-python \
python313-gobject \
python313-rtslib-fb \
targetcli-fb-common"

inherit rpm
