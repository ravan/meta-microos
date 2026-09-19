SUMMARY = "Encryption module for tik"
DESCRIPTION = "Encryption module for tik. Encrypts btrfs rootfs using various different supported credentials and recovery-keys."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "tik-module-encrypt-1.5.1-3.1.noarch.rpm"
RPM_HASH = "143b6176fa034bd1e070668f68d4685a96900452f2dc8a1efe444ad2e20ae771f2c2144981cec14add54d7594aa7a4751b36965c6c7470a5a87dff8580ef52b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tik-module-encrypt"

RDEPENDS:${PN} += "qrencode \
tik"

inherit rpm
