SUMMARY = "A hatch plugin to help build Jupyter packages"
DESCRIPTION = "This provides a build hook plugin for Hatch that \
adds a build step for use with Jupyter packages."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python313-hatch-jupyter-builder-0.9.1-2.8.noarch.rpm"
RPM_HASH = "1d9aa72cda55901fed0b2456881d1b5afe9308a3d185d6eb14f59669eeebcf3564e00c9e643c32f5b5b36cde9111372bd2a7ed2a2381820d2ab890e191b06253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-jupyter-builder \
python3.13dist-hatch-jupyter-builder \
python313-hatch-jupyter-builder \
python3dist-hatch-jupyter-builder"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-hatchling"

inherit rpm
