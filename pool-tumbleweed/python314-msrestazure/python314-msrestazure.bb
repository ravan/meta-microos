SUMMARY = "AutoRest swagger generator - Azure-specific module"
DESCRIPTION = "AutoRest swagger generator Python client runtime. Azure-specific module."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python314-msrestazure-0.6.4-5.9.noarch.rpm"
RPM_HASH = "9c690168ccf3d4927f5191691bfb92f08118bcf0ab4630d59a6e96524a5f7f7ad99ce5c69e9b7744b2623da22aee126721a81e95e255dbd654086a51dc5c3a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-msrestazure \
python314-msrestazure \
python3dist-msrestazure"

RDEPENDS:${PN} += "-python314-adal >= 0.6.0 with python314-adal < 2.0.0 \
-python314-msrest >= 0.6.0 with python314-msrest < 2.0.0 \
python-abi \
python314-six"

inherit rpm
