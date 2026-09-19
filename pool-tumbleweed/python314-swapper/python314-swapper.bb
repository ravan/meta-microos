SUMMARY = "The unofficial Django swappable models API"
DESCRIPTION = "Swapper is an unofficial API for the undocumented but very \
powerful Django feature: swappable models. Swapper facilitates \
implementing arbitrary swappable models in your own reusable apps."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python314-swapper-1.4.0-1.7.noarch.rpm"
RPM_HASH = "2fde700c0021b3dda418e35921b7ef823976bf86d11e3e4551b7f7be056745c48c00addd0ba65c8dc356e868e08fec54022ff7413f1bda8c7e9709a9369607ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-swapper \
python314-swapper \
python3dist-swapper"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
