SUMMARY = "Helpers for better testing"
DESCRIPTION = "Exam is a Python toolkit for writing better tests. \
It aims to remove a lot of the boiler plate testing \
code one often writes, while still following Python \
conventions and adhering to the unit testing interface."
LICENSE = "MIT"

PV = "0.10.6"

RPM_NAME = "python313-exam-0.10.6-7.2.noarch.rpm"
RPM_HASH = "2b2311e48889cc8744f3ca86565e9243a2ec5fd5f77bbc0aebfb45aed0c250ee91cb16f0ef3bd9ce61c79af6c8663a7ff31b89b88e6fbeaa3fa9c260d589e091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-exam \
python3.13dist-exam \
python313-exam \
python3dist-exam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
