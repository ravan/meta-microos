SUMMARY = "Sphinx extension that builds an HTML gallery of examples"
DESCRIPTION = "A Sphinx extension that builds an HTML gallery of examples from any set of Python scripts."
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python313-sphinx-gallery-0.21.0-1.2.noarch.rpm"
RPM_HASH = "385d07e44881eab9bf7bc4da99043d8921ce925e7e76e7c658a4c6a99b52c8aa02a4197dd9186e97428b5e89793cbb70c3b2edd8cba24fa443740b67c80a2725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-gallery \
python3.13dist-sphinx-gallery \
python313-sphinx-gallery \
python3dist-sphinx-gallery"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pillow \
python313-Sphinx \
update-alternatives"

inherit rpm
