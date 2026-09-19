SUMMARY = "Pure Python implementation of the WHATWG URL Standard"
DESCRIPTION = "pywhatwgurl implements the WHATWG URL Standard in pure Python, providing the \
URL and URLSearchParams interfaces with browser-compatible parsing, host and \
IDNA handling, percent-encoding and serialisation."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-pywhatwgurl-0.1.2-1.1.noarch.rpm"
RPM_HASH = "e1b20bf1bda13aea36d4381bb1310dde1d4a4bc279c413c237c2b0ee7495616720bb703e96589b0412013e4015afaf8e44ef8eff2fc52acaed53fa7deb021b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pywhatwgurl \
python314-pywhatwgurl \
python3dist-pywhatwgurl"

RDEPENDS:${PN} += "python-abi \
python314-idna"

inherit rpm
