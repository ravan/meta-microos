SUMMARY = "Core (offline) functionality for the apeye library"
DESCRIPTION = "Core (offline) functionality for the apeye library."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "python314-apeye-core-1.1.5-3.6.noarch.rpm"
RPM_HASH = "9ac620835fbb7c041e8382d8de58c3a923171311da62361fcae24c73cd09f0e3253660071b88c7dd8863d354e7176f3cb33894c4910399cdeb77d3d1bc3f4afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apeye-core \
python314-apeye-core \
python3dist-apeye-core"

RDEPENDS:${PN} += "python-abi \
python314-domdf-python-tools \
python314-idna"

inherit rpm
