SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.48"

RPM_NAME = "python313-magic-5.48-2.1.noarch.rpm"
RPM_HASH = "efb910eee948633699b47c28dbae9e43a47309d9d5de36b6b74e2c6f00a0a6b5d78a3e404e49150f13109f26d9d0e8e668c0f8974c9946e159460e9654ca0487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-file-magic \
python3-magic \
python3.13dist-file-magic \
python313-file-magic \
python313-magic \
python3dist-file-magic"

RDEPENDS:${PN} += "libmagic1 \
python-abi"

inherit rpm
