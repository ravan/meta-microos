SUMMARY = "Asynchronous Python client for Internet Printing Protocol (IPP)"
DESCRIPTION = "Asynchronous Python client for Internet Printing Protocol (IPP)."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python314-pyipp-0.17.2-1.4.noarch.rpm"
RPM_HASH = "b9aaec755b1e5482f76698c4d684f00f5be92eb32b223a4e994ebb0c6011e6f387c6ebf94d25091eda4860f3ebe8591c8a578d65e4797e939adf7f58ea17ba1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyipp \
python314-pyipp \
python3dist-pyipp"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-awesomeversion \
python314-backoff \
python314-deepmerge \
python314-yarl"

inherit rpm
