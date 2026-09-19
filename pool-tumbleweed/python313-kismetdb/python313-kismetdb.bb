SUMMARY = "A python wrapper for the Kismet database"
DESCRIPTION = "Kismet database wrapper."
LICENSE = "GPL-2.0-only"

PV = "2019.05.05"

RPM_NAME = "python313-kismetdb-2019.05.05-4.5.noarch.rpm"
RPM_HASH = "08ddc89f45e16f9dffe9993f5d43a609e2f71c53bb23ca535f74f240708cb1cd2ddc25a14e09199bc670aba69dfecfb3360c0ed5d60180093a430e026d02744f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kismetdb \
python3.13dist-kismetdb \
python313-kismetdb \
python3dist-kismetdb"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-python-dateutil \
python313-simplekml"

inherit rpm
