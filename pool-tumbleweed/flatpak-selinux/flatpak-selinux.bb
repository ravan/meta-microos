SUMMARY = "SELinux policy module for flatpak"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information. \
 \
This package provides the SELinux policy module for flatpak."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.2"

RPM_NAME = "flatpak-selinux-1.18.2-1.1.noarch.rpm"
RPM_HASH = "8d6848fcfbddd047b17e739cd3f565067dfad912982c8a90b6510811aad75965e0b1160a901fd8a502bc7a8384432610d617e65e3bdbe634b2bd3e23f3d8424d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatpak-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
flatpak \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base"

inherit rpm
