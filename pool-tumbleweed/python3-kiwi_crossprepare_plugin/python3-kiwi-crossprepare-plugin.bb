SUMMARY = "KIWI - Cross Image Arch Prepare Plugin"
DESCRIPTION = "Prepare an image root tree for a cross architecture build process."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.6"

RPM_NAME = "python3-kiwi_crossprepare_plugin-0.1.6-1.9.noarch.rpm"
RPM_HASH = "c5c7bd2fa915bba38c75c4ac1ef4c1d16247dd5d3635ea4a5868a6ffbe799b27c8ecf551a3e3d065c54b08b11cae52a03f6a581d1dc0ee06040fbe10f1edb34e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kiwi-crossprepare-plugin \
python3.13dist-kiwi-crossprepare-plugin \
python3dist-kiwi-crossprepare-plugin"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML \
python3-docopt \
python3-kiwi \
python3-setuptools \
qemu-linux-user"

inherit rpm
