SUMMARY = "Python library for the snappy compression library"
DESCRIPTION = "Python library for the snappy compression library from Google."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "python314-python-snappy-0.7.3-1.2.noarch.rpm"
RPM_HASH = "ba93d669e6eef4f1fef24f94b67ec8b00eec387c60c3e660d5bb84c220c6999341232df10da85899a299002a01d20634529515800f935ec4ea908443dc993816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-snappy \
python314-python-snappy \
python3dist-python-snappy"

RDEPENDS:${PN} += "python-abi \
python314-cramjam"

inherit rpm
