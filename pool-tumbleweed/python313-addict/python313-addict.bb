SUMMARY = "A dictionary using both attribute and item syntax"
DESCRIPTION = "Addict is a module that exposes a dictionary subclass that allows \
items to be set like attributes. Values are gettable and settable \
using both attribute and item syntax."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python313-addict-2.4.0-2.5.noarch.rpm"
RPM_HASH = "330e6cad8ceaf7692a947357d7c2180a7a28481f4ce5c8cdea81a2e95ea9622f15b85a6b63cf6aa65a143e7abbb9d1afe722422769951fe43ced73103db26710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-addict \
python3.13dist-addict \
python313-addict \
python3dist-addict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
