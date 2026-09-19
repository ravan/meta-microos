SUMMARY = "Painless YAML configuration"
DESCRIPTION = "Painless YAML configuration."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-confuse-2.2.0-1.3.noarch.rpm"
RPM_HASH = "b144a8b80182278a98303ac500609171447c635d4c0968e3968972a5c32163660caf5ae54826c32a7f4639923d17bdc5ecb66c779493bddd140d99528da4baf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-confuse \
python3.13dist-confuse \
python313-confuse \
python3dist-confuse"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML"

inherit rpm
