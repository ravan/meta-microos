SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python314-pytest-order-1.5.0-1.1.noarch.rpm"
RPM_HASH = "65c597f74afb4f07525cf77e23913c7f86ce41d41f1ab2ea055c9cf9ec15e18af00c3aa115cc7b2349299363fc2567658d32c3aeee7fefd60a41e94805630667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-order \
python314-pytest-order \
python3dist-pytest-order"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
