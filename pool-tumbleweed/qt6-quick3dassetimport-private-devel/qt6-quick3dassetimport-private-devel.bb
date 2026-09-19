SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetImport library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetImport that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dassetimport-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "eea1874223efcaadb3a37eb7ce16e03bbefefef32a0ab46f6c0b44e65b3be1515a80d552e08cbc60fd3c37c0263e5146d83aa7e40dcbf163998ffdc316450d1b"

RPROVIDES:${PN} += "cmake-Qt6Quick3DAssetImportPrivate \
qt6-quick3dassetimport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Quick3DAssetImport \
cmake-Qt6Quick3DUtilsPrivate"

inherit rpm
