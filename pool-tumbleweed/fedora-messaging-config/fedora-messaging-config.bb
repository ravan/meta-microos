SUMMARY = "Fedora Messaging configs"
DESCRIPTION = "Configuration files for the Fedora Messaging instances."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.1"

RPM_NAME = "fedora-messaging-config-3.9.1-1.1.noarch.rpm"
RPM_HASH = "dcb1e5931560f380d9a4200d38fe2d00d63f3ca9047c212402b5158a653800812ce69050106beaebb3730f9b694be8cf90751050d4739a05fcbaa61e512ac0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fedora-messaging-config \
fedora-messaging-config"

RDEPENDS:${PN} += ""

inherit rpm
