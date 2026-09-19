SUMMARY = "Development files for XRootD servers"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD server development."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-server-devel-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "7b00eac9978d20c0da36e15358059e2e1802273dd153ca4c779755262dec5e0301d0f5e76c013bf3316959e74daf4e16afb6fc28a27048f6401ee858dd870bc3"

RPROVIDES:${PN} += "xrootd-server-devel"

RDEPENDS:${PN} += "xrootd-client-devel \
xrootd-libs-devel \
xrootd-server-libs"

inherit rpm
