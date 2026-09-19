SUMMARY = "Python 2 / 3 compatibility, like six, but favouring Python 3"
DESCRIPTION = "python-nine is python-six 'turned around': whereas python-six used \
to make python2 idioms work in python3, python-nine makes python3 \
idioms work in python2."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.0"

RPM_NAME = "python314-nine-1.2.0-2.4.noarch.rpm"
RPM_HASH = "477c5212736d620ecf2cbdd39377afac4d9b8a0ffb1f6264999218353a1afd1c361836e4d473ed68f19989b99f20f6a72160605ce8a5bc7920cb402d52553a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nine \
python314-nine \
python3dist-nine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
