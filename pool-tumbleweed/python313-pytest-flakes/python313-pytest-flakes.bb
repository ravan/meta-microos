SUMMARY = "Pytest plugin to check source code with pyflakes"
DESCRIPTION = "py.test plugin for efficiently checking python source with pyflakes."
LICENSE = "MIT"

PV = "4.0.5"

RPM_NAME = "python313-pytest-flakes-4.0.5-2.5.noarch.rpm"
RPM_HASH = "68e0b2fcd95b3244163c80ccecd15e8c5606278289ad2c3483e1d50a28aaa474efb6fd79136f6334d3da24081b6755902776d08f8206db1ed3f1908e103c33c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flakes \
python3.13dist-pytest-flakes \
python313-pytest-flakes \
python3dist-pytest-flakes"

RDEPENDS:${PN} += "python-abi \
python313-pyflakes \
python313-pytest"

inherit rpm
