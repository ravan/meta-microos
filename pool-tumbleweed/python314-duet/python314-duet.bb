SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.9"

RPM_NAME = "python314-duet-0.2.9-2.5.noarch.rpm"
RPM_HASH = "1e4106d2d50bb3c320f7e5e5190b89b3f8074b897e72919417a0644f5216399e3f5e307da660ad655e37f366cfca4000c18b6d84c04832a7484c0fe891207d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-duet \
python314-duet \
python3dist-duet"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
