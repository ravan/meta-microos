SUMMARY = "Devel Package to nvidia-open-driver-G07-signed"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G07-signed"
LICENSE = "GPL-2.0-only & MIT"

PV = "595.99.02"

RPM_NAME = "nvidia-open-driver-G07-signed-default-devel-595.99.02-2.2.aarch64.rpm"
RPM_HASH = "d4689aad9acce825e76ad67b512fda52074349599161ee60a3cc602cd5cdd17e01f885df0d32cbe9438265608482641e4f2792f5f231353de819544db3ee39ac"

RPROVIDES:${PN} += "nvidia-open-driver-G07-signed-default-devel \
nvidia-open-driver-G07-signed-default-devel-gfx"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
