SUMMARY = "Helpers for better testing"
DESCRIPTION = "Exam is a Python toolkit for writing better tests. \
It aims to remove a lot of the boiler plate testing \
code one often writes, while still following Python \
conventions and adhering to the unit testing interface."
LICENSE = "MIT"

PV = "0.10.6"

RPM_NAME = "python314-exam-0.10.6-7.2.noarch.rpm"
RPM_HASH = "0902dcaa175b633e8d409e98b861113b2ae39f88ca9e9574b3a68950590b56e68b78311c30fc508a1631d69e3dc8d81a7658119f707f8874a3a42e9a55ca7412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-exam \
python314-exam \
python3dist-exam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
