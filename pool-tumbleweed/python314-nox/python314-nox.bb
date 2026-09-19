SUMMARY = "Flexible test automation"
DESCRIPTION = "Flexible test automation."
LICENSE = "Apache-2.0"

PV = "2026.4.10"

RPM_NAME = "python314-nox-2026.4.10-1.3.noarch.rpm"
RPM_HASH = "0d18a4beba2b793673d97f7f39d34c465ad89f71d856172328b850ff40478a058dcc570b17996fc7aeda9d26181611ac7445b788378fb3bcd5da665f719dfa70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nox \
python314-nox \
python3dist-nox"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-argcomplete \
python314-colorlog \
python314-packaging \
python314-virtualenv \
update-alternatives"

inherit rpm
