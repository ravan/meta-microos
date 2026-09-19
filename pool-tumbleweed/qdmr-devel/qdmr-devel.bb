SUMMARY = "Development files for dmrconf"
DESCRIPTION = "qDMR is a simple to use and feature-rich code-plug programming software \
(CPS) for cheap DMR radios. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libdmrconf."
LICENSE = "GPL-3.0-or-later"

PV = "0.15.1"

RPM_NAME = "qdmr-devel-0.15.1-1.1.aarch64.rpm"
RPM_HASH = "15cc0f2c1d9cfc285fe3ab7256ee045d72eb96b7a9f292036addbbc04df40cdf1c59385c196bd1fcd12d5392a2356b2643a6c8d188d0cca6194e8a99eb81ab27"

RPROVIDES:${PN} += "qdmr-devel"

RDEPENDS:${PN} += "libdmrconf0"

inherit rpm
