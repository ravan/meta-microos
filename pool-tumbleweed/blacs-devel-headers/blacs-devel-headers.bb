SUMMARY = "Development headers for BLACS"
DESCRIPTION = "This package contains headers for BLACS."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "blacs-devel-headers-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "30a2962b82cfe130a5bc3a322bb2ba6c434883bd25a88e16c6389cf14797752a25895b4296117b6e615dac2d3737cec7935b25345352d8fd209e1afce76853b8"

RPROVIDES:${PN} += "blacs-devel-headers"

RDEPENDS:${PN} += ""

inherit rpm
