SUMMARY = "Profiling plugin for pytest"
DESCRIPTION = "Profiling plugin for pytest"
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python313-pytest-profiling-1.8.1-1.6.noarch.rpm"
RPM_HASH = "238335ed6aa61f6d7f27484dd26a42ffe711550942e553140709be6d681792b7f78f74c8c2edc4401421c78f570412884d041260056b6af73fd3532bc32a5112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-profiling \
python3.13dist-pytest-profiling \
python313-pytest-profiling \
python3dist-pytest-profiling"

RDEPENDS:${PN} += "python-abi \
python313-gprof2dot \
python313-pytest"

inherit rpm
