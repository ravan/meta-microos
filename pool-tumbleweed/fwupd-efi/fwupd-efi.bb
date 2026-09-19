SUMMARY = "Firmware update EFI binaries"
DESCRIPTION = "A UEFI binary for the fwupd project for installing updates using the UpdateCapsule \
runtime service. \
 \
It was originally imported from the combined fwupd project, and is now \
maintained separately to allow fwupd userspace releases and fwupd-efi UEFI \
executable releases to follow a different cadence."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "fwupd-efi-1.8-1.7.aarch64.rpm"
RPM_HASH = "b66ade1b2732742c945ef884e501d9f2279f7117d05e8f9138e13a77ffb8aeac511b11a25d1d76c12065cb2a329ba9c22ee2fdc16342194770c95b8cd29b862d"

RPROVIDES:${PN} += "fwupd-efi"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
