SUMMARY = "Utilities for handling packages"
DESCRIPTION = "Utilities for handling packages."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python314-shippinglabel-2.3.0-1.4.noarch.rpm"
RPM_HASH = "0aad2f0e8c61677049d94e27a1b6b975b00293844e30d61e729a97529b8ed9e0caa5efb1850f28d907408d8229c4f73741f7691e105395d0be7d211eb301fa93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-shippinglabel \
python314-shippinglabel \
python3dist-shippinglabel"

RDEPENDS:${PN} += "python-abi \
python314-dist-meta \
python314-dom-toml \
python314-domdf-python-tools \
python314-packaging \
python314-typing-extensions"

inherit rpm
