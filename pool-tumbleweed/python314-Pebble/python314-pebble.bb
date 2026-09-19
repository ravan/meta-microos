SUMMARY = "Threading and multiprocessing eye-candy for Python"
DESCRIPTION = "Pebble provides an API to manage threads and processes within an application. \
It wraps Python’s standard library threading and multiprocessing objects."
LICENSE = "LGPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "python314-Pebble-5.2.0-1.4.noarch.rpm"
RPM_HASH = "6c74a98b5865e42208b1ea03c0b12425dde2ff70d74480fb6b4060b8a6535fd6dced7a468fc09f0c31c10f46ae35f10a18f18dc2a583b005bdae6ef7ea8c2a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pebble \
python314-Pebble \
python3dist-pebble"

RDEPENDS:${PN} += "python-abi"

inherit rpm
