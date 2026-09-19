SUMMARY = "A flake8 extension that checks for blind except: statements"
DESCRIPTION = "A flake8 extension that checks for blind except: statements"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-flake8-blind-except-0.2.1-2.5.noarch.rpm"
RPM_HASH = "f0723c581e8de4073f4a83716e70e14d64f754568bb8df170eb2550465272de28d62a8245c89df714d2e1aa224aa548930d25fb437b1a441feab5d9ef4e55aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-blind-except \
python314-flake8-blind-except \
python3dist-flake8-blind-except"

RDEPENDS:${PN} += "python-abi"

inherit rpm
