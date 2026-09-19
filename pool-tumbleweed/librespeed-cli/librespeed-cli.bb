SUMMARY = "Command line client for LibreSpeed"
DESCRIPTION = "Command line interface for LibreSpeed speed test backends, written in Go."
LICENSE = "LGPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "librespeed-cli-1.0.14-1.1.aarch64.rpm"
RPM_HASH = "228c845f4a2b0511d940da338472e29114c6699ea16f8e123db1d4b2794f4feb7f298a08277dc7f9a1d65514fde62c166661683ad037155721669f843db69310"

RPROVIDES:${PN} += "librespeed-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
