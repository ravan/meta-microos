SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python313-pytest-order-1.5.0-1.1.noarch.rpm"
RPM_HASH = "2aa529df8913bffe66d392d262e1bcf99f41451f7bb41135bde7695e7448d7750a27c51b73fb61c238313e1328553ef324d013b1fe51a11057eeff9a824845a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-order \
python3.13dist-pytest-order \
python313-pytest-order \
python3dist-pytest-order"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
