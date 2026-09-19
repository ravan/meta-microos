SUMMARY = "Autoimport missing python libraries"
DESCRIPTION = "Module to help automatically import missing python libraries when developing \
code."
LICENSE = "GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "python314-autoimport-1.6.1-1.5.noarch.rpm"
RPM_HASH = "1470c2b3f8cc6a32d29d5c9b8941f91cf8a243c097ab562ac499c6a56e84e90e74881df31b2549936c75c8ef01821592d81d8aeb11509b5a0412db1f7173c502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-autoimport \
python314-autoimport \
python3dist-autoimport"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi \
python314-autoflake \
python314-click \
python314-maison \
python314-pyprojroot \
python314-pyxdg \
python314-sh"

inherit rpm
