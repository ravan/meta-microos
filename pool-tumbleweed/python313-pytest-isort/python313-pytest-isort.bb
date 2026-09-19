SUMMARY = "Pytest plugin to check import ordering using isort"
DESCRIPTION = "This is a pytest plugin to check import ordering using isort."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-pytest-isort-4.0.0-3.6.noarch.rpm"
RPM_HASH = "278c625b203681cd0947233626aa5158c27ce25fc42796cf995cb84bd149dfadfefd9750f278a6b1145ace668653d3decd9eed6ad7aab6b42afae76ea1a25406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-isort \
python3.13dist-pytest-isort \
python313-pytest-isort \
python3dist-pytest-isort"

RDEPENDS:${PN} += "python-abi \
python313-isort \
python313-pytest"

inherit rpm
