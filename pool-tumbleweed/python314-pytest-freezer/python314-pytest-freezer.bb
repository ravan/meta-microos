SUMMARY = "Pytest plugin providing a fixture interface for spulec/freezegun"
DESCRIPTION = "Pytest plugin providing a fixture interface for freezegun. \
The fixture name is freezer. It is a freezegun.api.FrozenDateTimeFactory \
instance."
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "python314-pytest-freezer-0.4.9-2.7.noarch.rpm"
RPM_HASH = "88ba9a96510303749904d1ef0fd21809662c17ec65e8a52072f3690ac97e60fd6092d7b99b02e72cf21346949600c1c8a87dc5f71f9785a9f5daae01fcba7dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-freezer \
python314-pytest-freezer \
python3dist-pytest-freezer"

RDEPENDS:${PN} += "python-abi \
python314-freezegun \
python314-pytest"

inherit rpm
