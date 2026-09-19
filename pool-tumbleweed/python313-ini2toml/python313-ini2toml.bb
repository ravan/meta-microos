SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.15"

RPM_NAME = "python313-ini2toml-0.15-4.2.noarch.rpm"
RPM_HASH = "88ad33a96b9d8613ddac8c0d2cedb29fb9c9151be22ccc0ec80812c30c3d5fe34bc0195d23651649255d812f4c7ec6869e7688be0a1c259212a3b2150c28b6f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml \
python3.13dist-ini2toml \
python313-ini2toml \
python3dist-ini2toml"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging"

inherit rpm
