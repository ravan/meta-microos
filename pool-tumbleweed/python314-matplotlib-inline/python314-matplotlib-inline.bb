SUMMARY = "Inline Matplotlib backend for Jupyter"
DESCRIPTION = "Matplotlib Inline Back-end for IPython and Jupyter"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python314-matplotlib-inline-0.2.1-1.4.noarch.rpm"
RPM_HASH = "2e2aab20b85353db6254d8aa4575f993a476152ee679bdff7580cae014cea0fad7c9bff4a90e3fdde99bfa802146973b9f5f7f50016ad351e7944b52161d1711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-matplotlib-inline \
python314-matplotlib-inline \
python3dist-matplotlib-inline"

RDEPENDS:${PN} += "python-abi \
python314-traitlets"

inherit rpm
