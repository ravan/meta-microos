SUMMARY = "Typing stubs for setuptools"
DESCRIPTION = "Typing stubs for setuptools"
LICENSE = "Apache-2.0"

PV = "70.1.0.20240627"

RPM_NAME = "python314-types-setuptools-70.1.0.20240627-1.9.noarch.rpm"
RPM_HASH = "38d923b6cd7444d7868f803652a324ca9bdf122abc654024dd66b4d34f803a0006bd95ccd4ccbacc42692695d76ace95e5dd5a3621ba6a1a530a3a28c80d460a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-types-setuptools \
python314-types-setuptools \
python3dist-types-setuptools"

RDEPENDS:${PN} += ""

inherit rpm
