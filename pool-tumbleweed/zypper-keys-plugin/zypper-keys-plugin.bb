SUMMARY = "Zypper plugin to manage RPM keys"
DESCRIPTION = "Zypper plugin for RPM key management"
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "zypper-keys-plugin-0.5.0-1.7.noarch.rpm"
RPM_HASH = "d175c431d32eeae3fcfa8ff26d28e48a19d30c7c03be00c6dd75dfb965296f98d17a37e3991929e1b5ba0feb261a83fa4321edfbd293cd80686c4d4144512aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-zyppkeys \
python3dist-zyppkeys \
zypper-keys-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
curl \
python-abi \
python3-pytz \
python3-requests \
sudo \
zypper"

inherit rpm
