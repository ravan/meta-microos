SUMMARY = "Rect class for Pygame-like rectangular areas"
DESCRIPTION = "PyRect is a simple module with a Rect class for Pygame-like rectangular areas."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python314-PyRect-0.2.0-2.5.noarch.rpm"
RPM_HASH = "e05dbe9772fcaaa47dfc17493c244aff5949d414cf7056588641f6970c3d7e5a5878cc32e7004fe5613a5cf0a632512bcfd75f8f652f93fab8867adb14ad1887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyrect \
python314-PyRect \
python3dist-pyrect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
