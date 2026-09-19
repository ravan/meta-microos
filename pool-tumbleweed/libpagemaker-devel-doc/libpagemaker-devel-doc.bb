SUMMARY = "Documentation for the libpagemaker API"
DESCRIPTION = "This package contains documentation for the libpagemaker API."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-devel-doc-0.0.4-1.40.noarch.rpm"
RPM_HASH = "e84477c5dff0e7ef7bf057165844978a820478268a30d66d55eb191987e06c65b3d60ae7fe79b637046aff894184bf875a1936b0612348c141b9ac42c54bf4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpagemaker-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
