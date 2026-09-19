SUMMARY = "Typing stubs for python-dateutil"
DESCRIPTION = " \
 \
This is a PEP 561 type stub package for the `python-dateutil` package. It \
can be used by type-checking tools like"
LICENSE = "Apache-2.0"

PV = "2.9.0.20260305"

RPM_NAME = "python313-types-python-dateutil-2.9.0.20260305-1.3.noarch.rpm"
RPM_HASH = "5731c06b8d14a82430e3627c2b156d7c0082d55f218ad8e85dfb984be97eea03d8e140f0b3014045a94508392e2981e16c137889d19ac88f9281c3fccf3d08ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-types-python-dateutil \
python3.13dist-types-python-dateutil \
python313-types-python-dateutil \
python3dist-types-python-dateutil"

RDEPENDS:${PN} += ""

inherit rpm
