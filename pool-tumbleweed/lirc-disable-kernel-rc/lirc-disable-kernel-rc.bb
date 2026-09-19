SUMMARY = "Disable kernel ir device handling in favor of lirc"
DESCRIPTION = "Udev rule which disables the kernel built-in handling of infrared devices \
(i. e., rc* ones) by making lirc the only used protocol."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "lirc-disable-kernel-rc-0.10.2-2.5.noarch.rpm"
RPM_HASH = "4705867168ce676ed470fdd6b4c643c8a5ac99c4857c45c1a5b27f7c279bb7aa408a82999685ecfc3ce86d615c430619f894f9f7a57b3b5d799a29b76e2fd701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lirc-disable-kernel-rc"

RDEPENDS:${PN} += "lirc-core"

inherit rpm
