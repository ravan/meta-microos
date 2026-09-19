SUMMARY = "Flexible test automation"
DESCRIPTION = "Flexible test automation."
LICENSE = "Apache-2.0"

PV = "2026.2.9"

RPM_NAME = "python311-nox-2026.2.9-1.1.noarch.rpm"
RPM_HASH = "1a0f4bea52dee7fb88bc71b7c04622138cb0709712610d7ccc0491d82ba0a9de25ab7d6f30e15227e59ae5fbce1fb157485f28e30fc78b77d3c2cc2a1a747853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nox \
python311-nox \
python3dist-nox"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-argcomplete \
python311-colorlog \
python311-virtualenv \
update-alternatives"

inherit rpm
