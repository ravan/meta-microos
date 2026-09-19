SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies"
DESCRIPTION = "Small and dependency free `Python`_ package to infer file type and MIME \
type checking the `magic numbers`_ signature of a file or buffer. \
 \
This is a Python port from `filetype`_ Go package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-filetype-1.2.0-3.5.noarch.rpm"
RPM_HASH = "a168965606bfc0a6d47982870eda03a01e8bacefa2eb0e833f71144d3f96ceede678040909644842b429228261ac0c0509a89a6bc10baaa0db1f900ecb2f65d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-filetype \
python3.13dist-filetype \
python313-filetype \
python3dist-filetype"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
