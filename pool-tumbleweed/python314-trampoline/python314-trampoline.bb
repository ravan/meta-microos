SUMMARY = "Simple and tiny yield-based trampoline implementation"
DESCRIPTION = "A tiny yield-based trampoline for Python. Recursive functions can recurse \
virtually infinitely by yielding generator calls instead of calling \
themselves directly."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-trampoline-0.1.2-1.1.noarch.rpm"
RPM_HASH = "56111f6d0d016deae1198186dc131393096b87726f9dceef44f57de76038503cae83487ebeb864a53e4e4a5d8d48b8058b54a6ec0e2e76d0b799fc3480802757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-trampoline \
python314-trampoline \
python3dist-trampoline"

RDEPENDS:${PN} += "python-abi"

inherit rpm
