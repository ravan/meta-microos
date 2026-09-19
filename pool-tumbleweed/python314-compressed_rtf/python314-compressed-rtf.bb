SUMMARY = "Compressed Rich Text Format (RTF) compression and decompression package"
DESCRIPTION = "Compressed Rich Text Format (RTF) compression and decompression package"
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python314-compressed_rtf-1.0.7-2.5.noarch.rpm"
RPM_HASH = "4b7ef356fba4437d492b359532bb6532ceb46a25d340704689a3bd7c3db4b145f8b9249b5f4ec38dde927987112cb013dd9d843c561e9f42b8758e084a72deb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-compressed-rtf \
python314-compressed-rtf \
python3dist-compressed-rtf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
