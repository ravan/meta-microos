SUMMARY = "Sphinx extension that builds an HTML gallery of examples"
DESCRIPTION = "A Sphinx extension that builds an HTML gallery of examples from any set of Python scripts."
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python314-sphinx-gallery-0.21.0-1.2.noarch.rpm"
RPM_HASH = "ed9ad414eb1e3c317f77f936ee298faf79e28f2de1182d0bec82e7a28ce1d8b06562faa75b03dfd8a2516f175fa4a5fe8e52a0862371ec27576c692e944703fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-gallery \
python314-sphinx-gallery \
python3dist-sphinx-gallery"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pillow \
python314-Sphinx \
update-alternatives"

inherit rpm
