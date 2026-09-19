SUMMARY = "Documentation for python-happybase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase. \
 \
This package contains the documentation."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python-happybase-doc-1.3.0-1.2.noarch.rpm"
RPM_HASH = "df11ae1ee8e9590089bc2caae2787b0b3ad368104e30822a71f5dd34c70744349e5d8ec5c6d77784f1370cf2b09f3a67e8b1f0d70e5f315fb23e44ac06a2c7d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-happybase-doc \
python313-happybase-doc \
python314-happybase-doc"

RDEPENDS:${PN} += ""

inherit rpm
