SUMMARY = "SDR receiver for Itron ERT compatible smart meters"
DESCRIPTION = "An rtl-sdr receiver for Itron ERT compatible smart meters operating \
in the 900MHz ISM band."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "rtlamr-0.9.5-1.1.aarch64.rpm"
RPM_HASH = "c4a50b14d6865928e0bcbf0176fd61af7a6c52cb2d0f8eb5599875117b2615fe0ed5fe32ba655eaf2e565d89c40a8ea1455af4de4a8c2c5204577c61985884e8"

RPROVIDES:${PN} += "rtlamr"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
