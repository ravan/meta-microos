SUMMARY = "A retry layer for HTTPX"
DESCRIPTION = "A retry layer for the HTTPX client: configurable retry behaviour with \
exponential backoff for transient HTTP errors."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-httpx-retries-0.6.0-1.2.noarch.rpm"
RPM_HASH = "b1a6f17cee047a2c7bcc735de9e98f0101edc3541e91291f83a19f582e892df08a36089cd358d4bdbe95fc3ecb10da4feb687d4ff63f781d7290aed035cc9b6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpx-retries \
python3.13dist-httpx-retries \
python313-httpx-retries \
python3dist-httpx-retries"

RDEPENDS:${PN} += "python-abi \
python313-httpx"

inherit rpm
