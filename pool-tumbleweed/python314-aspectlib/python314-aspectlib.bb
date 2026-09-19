SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python314-aspectlib-2.0.0-2.12.noarch.rpm"
RPM_HASH = "99b3e6d49c0bc209215ef60aebebff9fc5dd0f51dc1153b4c2d6c2f200e0eb5f95e63830100c542cbc7a8b475abce141a63df37dc41aae70d8194abf3b68ff31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aspectlib \
python314-aspectlib \
python3dist-aspectlib"

RDEPENDS:${PN} += "python-abi \
python314-fields"

inherit rpm
