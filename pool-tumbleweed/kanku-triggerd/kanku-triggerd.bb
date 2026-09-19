SUMMARY = "Trigger daemon for kanku"
DESCRIPTION = "A triggerd for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-triggerd-1.0.0-2.2.noarch.rpm"
RPM_HASH = "68ec547308b3c6db2e99ddb8d0a85b6fd24ed04b21f515d363b27e714530befeab4ce9d24a1bf2d33c8b4e92857531abe7a0b8b348a4b1c2d2be51f23551f8f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-triggerd \
perl-Kanku--Daemon--TriggerD \
perl-Kanku--Listener--RabbitMQ"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server"

inherit rpm
