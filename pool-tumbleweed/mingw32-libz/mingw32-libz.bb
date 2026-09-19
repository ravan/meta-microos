SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
Compatibility package."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw32-libz-1.3.2-1.6.noarch.rpm"
RPM_HASH = "8e477a69869e5f8af0b061fd321c073bfebe9284625fc7ec8725a91ec1462c907f6a59b9ecc2df1633ddcc0b10fe78eb4ce59baa538912e620428dd8a2aece33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libz \
mingw32-libz.dll \
mingw32-zlib"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll"

inherit rpm
