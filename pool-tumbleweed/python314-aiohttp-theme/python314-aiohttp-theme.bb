SUMMARY = "A configurable sidebar-enabled Sphinx theme"
DESCRIPTION = "A configurable sidebar-enabled Sphinx theme used by aiohttp"
LICENSE = "BSD-3-Clause"

PV = "0.1.7"

RPM_NAME = "python314-aiohttp-theme-0.1.7-2.5.noarch.rpm"
RPM_HASH = "cfb0ae8005d624b2d7db75a15ab448973a320328bce37e3983f49c154b745bf537b87e09101c8f4b9d22724edfbc37b417ddc8001ee405c45263c6d48cb20b1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiohttp-theme \
python314-aiohttp-theme \
python3dist-aiohttp-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
