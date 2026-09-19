SUMMARY = "U2F host library for interacting with a U2F device over USB"
DESCRIPTION = "U2F host library for interacting with a U2F device over USB."
LICENSE = "Apache-2.0"

PV = "0.1.5a"

RPM_NAME = "python314-pyu2f-0.1.5a-7.5.noarch.rpm"
RPM_HASH = "6d208c84141d85053c7762726849fb45d286d0f36ac5768ae6c8fdb64a66118be9b4bc424ad4e3e45101a45fffd1bd523b1809506a5ac240237dc093690741f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyu2f \
python314-pyu2f \
python3dist-pyu2f"

RDEPENDS:${PN} += "python-abi"

inherit rpm
