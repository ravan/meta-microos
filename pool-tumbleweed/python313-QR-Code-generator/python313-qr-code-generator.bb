SUMMARY = "QR Code generator library"
DESCRIPTION = "This project aims to be the best, clearest QR Code generator library in multiple languages. \
The primary goals are flexible options and absolute correctness. \
Secondary goals are compact implementation size and good documentation comments."
LICENSE = "MIT"

PV = "1.8.0+git17.856ba8a"

RPM_NAME = "python313-QR-Code-generator-1.8.0+git17.856ba8a-3.6.aarch64.rpm"
RPM_HASH = "a19e7d11fecbe9f95d59168b1a5bece9ec4ab24ea121ff8ecd5a43704548c41c955dfddae1e0779c58000a02a503637417e30a15ecdf8b4d496a2da019f8dfd4"

RPROVIDES:${PN} += "python3-QR-Code-generator \
python3.13dist-qrcodegen \
python313-QR-Code-generator \
python3dist-qrcodegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
