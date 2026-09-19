SUMMARY = "Console carddav client"
DESCRIPTION = "Khard is an address book for the Unix console. \
It creates, reads, modifies and removes carddav address book entries at your local machine. \
Khard is also compatible to the email clients mutt and alot and the SIP client twinkle."
LICENSE = "GPL-3.0-only"

PV = "0.21.0"

RPM_NAME = "python313-khard-0.21.0-1.2.noarch.rpm"
RPM_HASH = "fd8fbddf64825b0211d83d4aaab006c6aa371edf5bfcfaaa5c17d3db710268fac6c15b1b24dfc24cd15d62e2aa2e74c9d81d8a9e3d0888f1e228860c6ab921ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-khard \
python3.13dist-khard \
python313-khard \
python3dist-khard"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-configobj \
python313-ruamel.yaml \
python313-vobject \
update-alternatives"

inherit rpm
