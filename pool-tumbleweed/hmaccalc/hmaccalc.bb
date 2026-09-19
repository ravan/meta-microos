SUMMARY = "Tools for computing and checking HMAC values for files"
DESCRIPTION = "The hmaccalc package contains tools which can calculate HMAC (hash-based \
message authentication code) values for files.  The names and interfaces are \
meant to mimic the sha*sum tools provided by the coreutils package."
LICENSE = "BSD-3-Clause"

PV = "0.9.14"

RPM_NAME = "hmaccalc-0.9.14-3.14.aarch64.rpm"
RPM_HASH = "1d911fc7c436f2e96f4d35fc11c0b166bdc928c392823fa4a225f20e894b69f30d3c583095028c5ad6a1bc5144aa85d3b337080b5c727049397c32b78f80734b"

RPROVIDES:${PN} += "hmaccalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so"

inherit rpm
