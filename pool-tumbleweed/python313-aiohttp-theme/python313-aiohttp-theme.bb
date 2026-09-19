SUMMARY = "A configurable sidebar-enabled Sphinx theme"
DESCRIPTION = "A configurable sidebar-enabled Sphinx theme used by aiohttp"
LICENSE = "BSD-3-Clause"

PV = "0.1.7"

RPM_NAME = "python313-aiohttp-theme-0.1.7-2.5.noarch.rpm"
RPM_HASH = "d3040376797626f073aabb80ba17bd48f93ed85996217def47e2eee85d28110f5260ffe741392b84bc54b62b821d67d9e0e7d274ac7584a176f2c3d9972e1856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-theme \
python3.13dist-aiohttp-theme \
python313-aiohttp-theme \
python3dist-aiohttp-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
