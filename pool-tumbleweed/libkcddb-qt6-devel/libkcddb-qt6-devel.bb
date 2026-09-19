SUMMARY = "Development files for KDE CDDB library"
DESCRIPTION = "This package includes the development headers for libkcddb."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkcddb-qt6-devel-26.08.1-15.1.aarch64.rpm"
RPM_HASH = "f45be4e282a7ee32392982106c8b75f79ebc24695e47f5d9c78f5a5b0e982dc3f06c5fb9ade4f81ab1b95c9cf31a85e532275b872eee2a966369f434cc68981f"

RPROVIDES:${PN} += "cmake-KCddb6 \
libkcddb-qt6-devel"

RDEPENDS:${PN} += "libKCddb5"

inherit rpm
