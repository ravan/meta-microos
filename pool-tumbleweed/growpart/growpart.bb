SUMMARY = "Grow a partition"
DESCRIPTION = "Grow a partition. This is predominantly useful in the cloud when an instance is \
started with a larger root partition than the image size. The root partition \
can be expanded to take up the additional size."
LICENSE = "GPL-3.0-only"

PV = "0.33"

RPM_NAME = "growpart-0.33-2.7.noarch.rpm"
RPM_HASH = "d34572bc418791dad2f0ed19de7653e25983c0b7fad85d15c7c54d4167cf16984139d7d439773451d32ef3efef932d50219fef62413aa4c287bed92ba540e684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "growpart"

RDEPENDS:${PN} += "/usr/bin/sh \
gptfdisk \
util-linux"

inherit rpm
