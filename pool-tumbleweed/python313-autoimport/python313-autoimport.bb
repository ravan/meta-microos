SUMMARY = "Autoimport missing python libraries"
DESCRIPTION = "Module to help automatically import missing python libraries when developing \
code."
LICENSE = "GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "python313-autoimport-1.6.1-1.5.noarch.rpm"
RPM_HASH = "0d0f28f7056e2eb83aa5fb275d682c7aade67f0d40df3da7093566081f06d2cd1e13ae5b0fa999dd3f290649ee69088feebb28d18424f4a783e8da56dbab61bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoimport \
python3.13dist-autoimport \
python313-autoimport \
python3dist-autoimport"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-autoflake \
python313-click \
python313-maison \
python313-pyprojroot \
python313-pyxdg \
python313-sh"

inherit rpm
