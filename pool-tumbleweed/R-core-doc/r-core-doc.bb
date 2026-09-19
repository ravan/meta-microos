SUMMARY = "Package provides all documentation of R base. PDFs, man pages, info pages"
DESCRIPTION = "This packages provides all documentation of R base. PDFs, man pages, info pages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-core-doc-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "b4e6eae4df6d5c246c6445633bc6330e9179e19a469c585e5ee7304b4f5c1d3811f0bc17208f6cb86f3205f3753927df1f187648d866ee953c28d5f0e2c90c38"

RPROVIDES:${PN} += "R-core-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
