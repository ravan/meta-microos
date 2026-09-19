SUMMARY = "Python time mocking"
DESCRIPTION = "A python library that helps users write deterministic tests for time sensitive and I/O intensive code."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-time-travel-1.1.2-4.5.noarch.rpm"
RPM_HASH = "6954c1fb8d73ad2ed9d3ad25abcfaa873342a6b14bcfb55873559f8cbe66cd73f35b122efabe7e48ee7b6a96f06bac7b5a878046d65aaf08f97b0297e1c6967e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-time-travel \
python3.13dist-time-travel \
python313-time-travel \
python3dist-time-travel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
