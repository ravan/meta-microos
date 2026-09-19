SUMMARY = "Development files for libsubtitleeditor"
DESCRIPTION = "The libsubtitleeditor-devel package contains libraries and header files for \
developing applications that use libsubtitleeditor0."
LICENSE = "GPL-3.0-or-later"

PV = "0.56.2"

RPM_NAME = "libsubtitleeditor-devel-0.56.2-1.4.aarch64.rpm"
RPM_HASH = "12edbdb8afe36fea878db075d5c0eaa88beb82d8491f50a80137777296a1878ff56b37c43abacc9797cfbe176d79e386b204f02e56dfebfb6353b72387177c25"

RPROVIDES:${PN} += "libsubtitleeditor-devel"

RDEPENDS:${PN} += "libsubtitleeditor0"

inherit rpm
