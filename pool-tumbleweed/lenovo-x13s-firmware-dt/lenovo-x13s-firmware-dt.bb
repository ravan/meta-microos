SUMMARY = "Lenovo X13s DTB installation"
DESCRIPTION = "Install DTB on ESP for Lenovo X13s."
LICENSE = "GPL-2.0-only"

PV = "2023.10.16"

RPM_NAME = "lenovo-x13s-firmware-dt-2023.10.16-3.6.aarch64.rpm"
RPM_HASH = "49829fe70edbb03968ce848973169dd76020c885ede5b5a1ba98e1a2fd9021bf95d9b5744ba2b29db4d7b5bbe3da08d15fd7ff4e6aa46729056ad4abcacc2dd7"

RPROVIDES:${PN} += "lenovo-x13s-firmware-dt"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
