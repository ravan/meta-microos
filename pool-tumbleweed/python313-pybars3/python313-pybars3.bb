SUMMARY = "Handlebarsjs templating for Python 3 and 2"
DESCRIPTION = "Pybars3 provides a template system for Python which is compatible with \
Handlebars.js.  It is a fork of the pybars project that adds Python 3 \
compatibility and numerous features from Handlebars.js 2.0."
LICENSE = "LGPL-3.0-only"

PV = "0.9.7"

RPM_NAME = "python313-pybars3-0.9.7-2.5.noarch.rpm"
RPM_HASH = "e0c1b35bb7cb9ba01b854ebaf5772b791626e5805d232d4c7adca608590fa940d3210e57c226137185693c4a3d8e6751534b7ac897a5f2a23638e528f54f63d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybars3 \
python3.13dist-pybars3 \
python313-pybars3 \
python3dist-pybars3"

RDEPENDS:${PN} += "python-abi \
python313-PyMeta3"

inherit rpm
