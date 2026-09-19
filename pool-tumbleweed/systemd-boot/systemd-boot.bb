SUMMARY = "A simple UEFI boot manager"
DESCRIPTION = "This package provides systemd-boot (short: sd-boot), which is a simple UEFI boot \
manager. It provides a textual menu to select the entry to boot and an editor \
for the kernel command line. systemd-boot supports systems with UEFI firmware \
only. \
 \
This package also contains bootctl(1) and services to manage boot loaders that \
implement the Boot Loader Specification[1] and the Boot Loader Interface[2] on \
EFI systems, such as systemd-boot. \
 \
Note that systemd-boot is not fully integrated in openSUSE distributions yet \
hence its installation requires special care and manual steps when used on \
systems supporting secure boot or snapshots. For more details, visit: \
https://en.opensuse.org/Systemd-boot \
 \
[1] https://uapi-group.org/specifications/specs/boot_loader_specification/ \
[2] https://systemd.io/BOOT_LOADER_INTERFACE/"
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-boot-261.2-1.2.aarch64.rpm"
RPM_HASH = "813c3f545f1a8df31ca5af170568a549b350e4b91788b69be9553da175e77ce323071f9dd801a9d905f883e6dcd2151b5e07e5f9d373d9ad45b1a9a311ba45a1"

RPROVIDES:${PN} += "systemd-boot"

RDEPENDS:${PN} += ""

inherit rpm
