SUMMARY = "Pure Python implementation of the WHATWG URL Standard"
DESCRIPTION = "pywhatwgurl implements the WHATWG URL Standard in pure Python, providing the \
URL and URLSearchParams interfaces with browser-compatible parsing, host and \
IDNA handling, percent-encoding and serialisation."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-pywhatwgurl-0.1.2-1.1.noarch.rpm"
RPM_HASH = "c6d88114b0e7909e39fc14d131bb8a2af1aae836220f4324d1b4a38c1fbc952046c222cee703aa501ef13bd9c29f4e0a1dc00cfad1d1bf988048d50f3a63fb99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywhatwgurl \
python3.13dist-pywhatwgurl \
python313-pywhatwgurl \
python3dist-pywhatwgurl"

RDEPENDS:${PN} += "python-abi \
python313-idna"

inherit rpm
