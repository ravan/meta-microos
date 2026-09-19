SUMMARY = "Network configuration scripts for Microsoft Azure"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Microsoft Azure with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.20"

RPM_NAME = "cloud-netconfig-azure-1.20-1.2.noarch.rpm"
RPM_HASH = "611b36541a5eaa1ab8eddef9c99b05ac0d7a4a8fed26af9f9bb17f8db56c7266802e5a3b66e86d61cf15e39f29a956089df6f43a5d2fedd6a7525ec8ae549fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-azure \
cloud-netconfig-nm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
udev"

inherit rpm
