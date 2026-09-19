SUMMARY = "A Tox plugin that builds and installs wheels instead of sdist"
DESCRIPTION = "A Tox plugin that builds and installs wheels instead of sdist."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python313-tox-wheel-1.0.0-2.5.noarch.rpm"
RPM_HASH = "d4c085c0110cdd6ec5da503de5d1d19365e6e5c24ef6bce1d58e638dd8d7f39636c7eea1870fc8b27c523b824e0912489cc64af4865420306db3d0be71799a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tox-wheel \
python3.13dist-tox-wheel \
python313-tox-wheel \
python3dist-tox-wheel"

RDEPENDS:${PN} += "python-abi \
python313-tox \
python313-wheel"

inherit rpm
