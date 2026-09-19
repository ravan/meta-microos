SUMMARY = "A Tox plugin that builds and installs wheels instead of sdist"
DESCRIPTION = "A Tox plugin that builds and installs wheels instead of sdist."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python311-tox-wheel-1.0.0-2.3.noarch.rpm"
RPM_HASH = "28f89c9be5496cb01367de1df5fe810997a9f0b2efd230a4c8e7022e709d42dd86b2ab229dfbf0d3befd5e2a3dcf4e5e14219f4c1b4b303e1e9fea9967c0b926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tox-wheel \
python311-tox-wheel \
python3dist-tox-wheel"

RDEPENDS:${PN} += "python-abi \
python311-tox \
python311-wheel"

inherit rpm
