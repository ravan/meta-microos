SUMMARY = "Accelerated property cache"
DESCRIPTION = "Accelerated property cache"
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python314-propcache-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "cebc28c98e060f9725c967b73a9a7c2beb87c3bb0a4d2d31317940ac503223eefa9af764700e5b6b2b6653a7440b9f0db4905a9dc1734ec9612cd0898c5e27da"

RPROVIDES:${PN} += "python3.14dist-propcache \
python314-propcache \
python3dist-propcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
