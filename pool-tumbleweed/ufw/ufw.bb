SUMMARY = "Uncomplicated Firewall"
DESCRIPTION = "The Uncomplicated Firewall(ufw) is a front-end for netfilter, which \
aims to make it easier for people unfamiliar with firewall concepts. \
Ufw provides a framework for managing netfilter as well as \
manipulating the firewall."
LICENSE = "GPL-3.0-only"

PV = "0.36.2"

RPM_NAME = "ufw-0.36.2-2.4.noarch.rpm"
RPM_HASH = "b95b70e05405be3af32723e9db36584f29c3f144a67b1fe237afde1f2a4a65ad3dede1a9060ae42c88bddbff06fbb41de3c5035c25708b52fb7ff7576febe4ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ufw \
python3.13dist-ufw \
python3dist-ufw \
ufw"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
bash-completion \
python-abi \
systemd"

inherit rpm
