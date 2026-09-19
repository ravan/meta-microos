SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.3"

RPM_NAME = "python313-async_timeout-4.0.3-1.12.noarch.rpm"
RPM_HASH = "b865458c9e4a7cf314593e41af8ef3ffe84eb3b06a4e5a3114057873dd1c604e38d5bbffbbe351dc6978c72fd5f161b710759a94a7a2cf6d30b3a555e39e860a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-timeout \
python3.13dist-async-timeout \
python313-async-timeout \
python3dist-async-timeout"

RDEPENDS:${PN} += "python-abi"

inherit rpm
