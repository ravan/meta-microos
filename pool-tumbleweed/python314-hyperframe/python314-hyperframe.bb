SUMMARY = "HTTP/2 framing layer for Python"
DESCRIPTION = "This library contains the HTTP/2 framing code used in the hyper project. \
It provides a pure-Python codebase that is capable of decoding a binary \
stream into HTTP/2 frames."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python314-hyperframe-6.1.0-1.5.noarch.rpm"
RPM_HASH = "7955335deb09d5cc42ed1a3973bd9aef3bad4b3415f0232b67bbd296674ced1a66d2574a213ef3c161bc8ceda4ba7e8a8c1592c607868980e9b1ac089d32f25a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hyperframe \
python314-hyperframe \
python3dist-hyperframe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
