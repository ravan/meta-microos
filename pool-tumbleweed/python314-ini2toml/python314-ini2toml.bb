SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.15"

RPM_NAME = "python314-ini2toml-0.15-4.2.noarch.rpm"
RPM_HASH = "2717dbc010900c23a40056a7a33340f12f485be9b611a11d486a9f49acca84410bbf187ec01985c77c23c2e7bb00918bc93035f7644997bb1d4fcf0771270d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ini2toml \
python314-ini2toml \
python3dist-ini2toml"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging"

inherit rpm
