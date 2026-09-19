SUMMARY = "Library for defining bulk search patterns to perform advanced string matching"
DESCRIPTION = "ReBulk is a Python library that performs advanced searches in \
strings that would be hard to implement using the re module or \
String methods only. \
 \
It includes some features like Patterns, Match, Rule that \
allow building a custom and complex string matcher."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python313-rebulk-6.0.1-1.1.noarch.rpm"
RPM_HASH = "42fcec6e7fcc31ae8ce1781d8302c39e876dc491e893abddbc2213e2bb22dd8c0d731de3e62f3fd0d67d696066aba28f8e167c4a82798d98d7c00de3406aef0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rebulk \
python3.13dist-rebulk \
python313-rebulk \
python3dist-rebulk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
