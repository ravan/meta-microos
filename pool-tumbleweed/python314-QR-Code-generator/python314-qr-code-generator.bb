SUMMARY = "QR Code generator library"
DESCRIPTION = "This project aims to be the best, clearest QR Code generator library in multiple languages. \
The primary goals are flexible options and absolute correctness. \
Secondary goals are compact implementation size and good documentation comments."
LICENSE = "MIT"

PV = "1.8.0+git17.856ba8a"

RPM_NAME = "python314-QR-Code-generator-1.8.0+git17.856ba8a-3.6.aarch64.rpm"
RPM_HASH = "6fe726bb779fd2661fd9208f8fb3e0b8e4ca1b531375200de49bc9e68c50792d818932c977b4ec06cfcc604e2ec329fb3d5117b2e7338921193a65c60d2b9653"

RPROVIDES:${PN} += "python3.14dist-qrcodegen \
python314-QR-Code-generator \
python3dist-qrcodegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
