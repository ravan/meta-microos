SUMMARY = "A hatch plugin to help build Jupyter packages"
DESCRIPTION = "This provides a build hook plugin for Hatch that \
adds a build step for use with Jupyter packages."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python314-hatch-jupyter-builder-0.9.1-2.8.noarch.rpm"
RPM_HASH = "16a0c033588b26f989caf48fed46dd27a9865d510dedca7527a7ce89916813384c47575ea7ce28d7079cdb9a5e50e621eb1fc6676639caa058003fcca6de2c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatch-jupyter-builder \
python314-hatch-jupyter-builder \
python3dist-hatch-jupyter-builder"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-hatchling"

inherit rpm
