SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "python313-copr-cli-2.4-1.4.noarch.rpm"
RPM_HASH = "850595bb14da6e5e543a475ab5e0b957790d0352eaa318b9d8370f1c61fea399d88506036be375ef2d53499a6bdfc6a3ed7b002ac40d7efd87e0f9c720ab426d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-copr-cli \
python3.13dist-copr-cli \
python313-copr-cli \
python3dist-copr-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Jinja2 \
python313-copr \
python313-humanize \
python313-setuptools"

inherit rpm
