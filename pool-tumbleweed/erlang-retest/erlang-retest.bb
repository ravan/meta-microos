SUMMARY = "Erlang retest library"
DESCRIPTION = "Erlang retest library."
LICENSE = "MIT"

PV = "1.1.1+git20160312.ffef7d0"

RPM_NAME = "erlang-retest-1.1.1+git20160312.ffef7d0-2.11.aarch64.rpm"
RPM_HASH = "1dbde2150c261ff29706f11f27a820e3291055241ddf48846c0d2876eab4826c072c400d17b3a69a82551a4962694adf650934a518481367edb29c29461cd2a1"

RPROVIDES:${PN} += "erlang-retest"

RDEPENDS:${PN} += "erlang"

inherit rpm
