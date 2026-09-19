SUMMARY = "Header files for gnu-recutils libraries"
DESCRIPTION = "This package contains files to develop for gnu-recutils libraries"
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "gnu-recutils-devel-1.9-3.4.aarch64.rpm"
RPM_HASH = "a9ebf8f9c8d1415398b840e4a0cb90c75546b707230b43a92d40c58c1f58d0d65e6e112442cc83a63ffd8e42481c86268f203906da918008f0130c7bac5a78f8"

RPROVIDES:${PN} += "gnu-recutils-devel"

RDEPENDS:${PN} += "librec1 \
readrec0 \
testrec0"

inherit rpm
