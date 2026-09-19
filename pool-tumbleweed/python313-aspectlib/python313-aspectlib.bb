SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python313-aspectlib-2.0.0-2.12.noarch.rpm"
RPM_HASH = "621a00df6a584a9a1480390e7d67b9dcc2af06c7f08554f27f55974006452e9dbec1a7118f4b057aebab751796ae6118a1d7d612c6d1c071570a5fa2a78c9987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aspectlib \
python3.13dist-aspectlib \
python313-aspectlib \
python3dist-aspectlib"

RDEPENDS:${PN} += "python-abi \
python313-fields"

inherit rpm
