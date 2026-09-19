SUMMARY = "A simple library to get or create a unique device id for a device in Python"
DESCRIPTION = "A simple library to get or create a unique device id for a device in Python."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-py-deviceid-0.1.1-1.5.noarch.rpm"
RPM_HASH = "5d8f1e18956cfd376876b31bbdbb3e972930414dfa68cfeb5be0fa6da6abe56091d79296ce4a8e7b5c829c6e19eac5b6922e954bc05c409385e995470f1b8e4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-deviceid \
python314-py-deviceid \
python3dist-py-deviceid"

RDEPENDS:${PN} += "python-abi"

inherit rpm
