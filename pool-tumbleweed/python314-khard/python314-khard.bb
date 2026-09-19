SUMMARY = "Console carddav client"
DESCRIPTION = "Khard is an address book for the Unix console. \
It creates, reads, modifies and removes carddav address book entries at your local machine. \
Khard is also compatible to the email clients mutt and alot and the SIP client twinkle."
LICENSE = "GPL-3.0-only"

PV = "0.21.0"

RPM_NAME = "python314-khard-0.21.0-1.2.noarch.rpm"
RPM_HASH = "2259117caebb3242cfe0a751b998060ef599a6f8c0721967974051a4a3900356d99980f6edae10afb271a9d1849f4417941a12daa6aa3f62268f9e0ad7af16a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-khard \
python314-khard \
python3dist-khard"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-configobj \
python314-ruamel.yaml \
python314-vobject \
update-alternatives"

inherit rpm
