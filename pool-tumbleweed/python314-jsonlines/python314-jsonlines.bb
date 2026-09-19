SUMMARY = "Library with helpers for the jsonlines file format"
DESCRIPTION = "Python library to simplify working with jsonlines_ and ndjson_ data."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python314-jsonlines-4.0.0-2.5.noarch.rpm"
RPM_HASH = "f130da8e0b165c07b41bde0b254207d8c9731a28668f43dcd0a605469c95b46b3baebe96e1d520d32f49a7c231b23420316cb9ca9beb3b3b35799d71349c9a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonlines \
python314-jsonlines \
python3dist-jsonlines"

RDEPENDS:${PN} += "python-abi \
python314-attrs"

inherit rpm
