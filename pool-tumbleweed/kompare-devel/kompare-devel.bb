SUMMARY = "Development files for the File Comparator"
DESCRIPTION = "Development files for the File Comparator package"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kompare-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ff09e1e2677690fa9963ce591a7f0023083df10403ba167e7663517b1297da25c3c9f3c34d5cb97443e8179ba4fe5db32a9c2c3462ab9c276cc9773dde2dbf58"

RPROVIDES:${PN} += "kompare-devel"

RDEPENDS:${PN} += "kompare"

inherit rpm
