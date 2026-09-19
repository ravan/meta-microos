SUMMARY = "Python3 support for libcaca"
DESCRIPTION = "This package contains all that is needed to use libcaca from python3."
LICENSE = "WTFPL"

PV = "0.99.beta20+git.1776622070.7c8e333"

RPM_NAME = "python314-caca-0.99.beta20+git.1776622070.7c8e333-2.3.noarch.rpm"
RPM_HASH = "3cc2eeb93091c37fbccdb1a78e8fa2ad59c95b3725be9b06335600377d8e42a25805ee21d7acb594d19ffcdf31bb595a97e07434213ecb325fc116c1ca3a24f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-caca \
python314-caca \
python3dist-caca"

RDEPENDS:${PN} += "libcaca \
python-abi"

inherit rpm
