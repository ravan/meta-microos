SUMMARY = "Full Disk Encryption for images"
DESCRIPTION = "This package contains the scripts necessary to plug Full Disk Encryption \
into the JeOS Firstboot framework used for image based delivery of ALP."
LICENSE = "GPL-2.0-only"

PV = "0.7.7"

RPM_NAME = "fde-firstboot-0.7.7-1.1.noarch.rpm"
RPM_HASH = "2a5bda4369c41c27e8541cbf0c55443882587454e6ac1c18f3a8db62f7502acbcf85299a4780614c2ab136a9a28d6b7c3cf139d25a0a62debd3387ee32a79d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fde-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
fde-tools \
jeos-firstboot"

inherit rpm
