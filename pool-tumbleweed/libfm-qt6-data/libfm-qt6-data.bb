SUMMARY = "Data files for libfm library"
DESCRIPTION = "Provides data to be read by libfm-qt"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libfm-qt6-data-2.4.0-1.6.noarch.rpm"
RPM_HASH = "f6772a4721b73371d64271369c3476d8982eaf197722cdbb1349526e4396d23104e26da9b4c0afa35e41c211e049152096c6d121412d99ed579bd63d2a46171b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-qt6-data"

RDEPENDS:${PN} += ""

inherit rpm
