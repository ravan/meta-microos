SUMMARY = "Busybox applets replacing wget"
DESCRIPTION = "This package contains the symlinks to replace wget with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-wget-1.38.0-42.2.noarch.rpm"
RPM_HASH = "5c7e6fcef0e7a7442083fa6b62b405fbc3991b01e03ffd51712605e8177da9f32dacd09fbdd2166fd864e8ad395c88a2fa2c7231dfdd45878361ab34862b2c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-wget"

RDEPENDS:${PN} += "busybox"

inherit rpm
