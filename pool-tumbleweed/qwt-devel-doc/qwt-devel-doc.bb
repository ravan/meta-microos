SUMMARY = "Development documentation for Qwt"
DESCRIPTION = "This package contains the development documentation of the Qwt widgets \
as is it created by doxygen."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-devel-doc-5.2.3_qt5+git20181129.2819734-4.8.aarch64.rpm"
RPM_HASH = "6164df532691124fffbc961dcea88a30e5d32c88ddb7158080abffcec0b3642942a3529a9a9b7f53384d0c44859173704408332344ecb4a3e0ccf5d098b29df6"

RPROVIDES:${PN} += "libqwt5-devel-doc \
qwt-devel-doc"

RDEPENDS:${PN} += "qwt-devel"

inherit rpm
