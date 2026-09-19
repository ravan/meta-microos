SUMMARY = "A python config parser for Vyatta/VyOS"
DESCRIPTION = "Vyatta/VyOS config parser with unicode support and without dependencies."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python314-VyattaConfParser-0.5.5-2.5.noarch.rpm"
RPM_HASH = "9a86ebdbd43b830cf801984713f1bff55b4ccab010732b370933ed84847c80f4b83cf85206f3ad9c6cd79d3dc733956fe7308c53d1b4f2831774018701515508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vyattaconfparser \
python314-VyattaConfParser \
python3dist-vyattaconfparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
