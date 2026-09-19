SUMMARY = "Proton keyring Linux library"
DESCRIPTION = "Proton keyring Linux library."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "python314-proton-keyring-linux-0.2.3-1.1.noarch.rpm"
RPM_HASH = "a554bba9f84bbfa1a298819272ff906f340bb0b9335b64c22ea431798259830dc7fc2599406b07ff136975540ee51613e2e20ff05235b67dcda4b6cf59a1d631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-proton-keyring-linux \
python314-proton-keyring-linux \
python314-proton-keyring-linux-secretservice \
python3dist-proton-keyring-linux"

RDEPENDS:${PN} += "python-abi \
python314-keyring \
python314-proton-core"

inherit rpm
