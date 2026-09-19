SUMMARY = "Python library to return the first true value of an iterable"
DESCRIPTION = "A Python library that returns the first true value of an iterable."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python313-first-2.0.2-6.5.noarch.rpm"
RPM_HASH = "e1b759155004c2d4ac7a7acaedc1db7bb957b73aa9a02df8d131116c2f7e4bef343210da0b82d8d37e60f183b5e283ea7797084d75065eabe8c69f727fb4740f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-first \
python3.13dist-first \
python313-first \
python3dist-first"

RDEPENDS:${PN} += "python-abi"

inherit rpm
