SUMMARY = "Flexible test automation"
DESCRIPTION = "Flexible test automation."
LICENSE = "Apache-2.0"

PV = "2026.4.10"

RPM_NAME = "python313-nox-2026.4.10-1.3.noarch.rpm"
RPM_HASH = "46715a089558615cdebc513cc4f1fab142d534d40274f933df9f459b61a7be6c12d6315fb0bb0936ea60f85001d79751db253ff29a55827c2a0d7e191dbe69f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nox \
python3.13dist-nox \
python313-nox \
python3dist-nox"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-argcomplete \
python313-colorlog \
python313-packaging \
python313-virtualenv \
update-alternatives"

inherit rpm
