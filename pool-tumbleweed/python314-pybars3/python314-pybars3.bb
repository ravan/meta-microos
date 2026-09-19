SUMMARY = "Handlebarsjs templating for Python 3 and 2"
DESCRIPTION = "Pybars3 provides a template system for Python which is compatible with \
Handlebars.js.  It is a fork of the pybars project that adds Python 3 \
compatibility and numerous features from Handlebars.js 2.0."
LICENSE = "LGPL-3.0-only"

PV = "0.9.7"

RPM_NAME = "python314-pybars3-0.9.7-2.5.noarch.rpm"
RPM_HASH = "e744413ad26860bc6606778f6113bcf8db41b40bd6eab85da3f2708fafc054f965f2eaad4ad0f0babd3cc93f235cceeaaf158dd0b93b26da3f797be06768a167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pybars3 \
python314-pybars3 \
python3dist-pybars3"

RDEPENDS:${PN} += "python-abi \
python314-PyMeta3"

inherit rpm
