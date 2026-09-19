SUMMARY = "RSS Feed Reader"
DESCRIPTION = "RSSTail is more or less an RSS reader: it monitors an RSS feed and if it \
detects a new entry, it will emit only that new entry."
LICENSE = "GPL-2.0-only"

PV = "2.2"

RPM_NAME = "rsstail-2.2-1.6.aarch64.rpm"
RPM_HASH = "e72a91c90bf9364ce4115255a2a4449fb5f86fa247e13648700b872f1ec3c8fcd4ca0cbb2b36d27d249712e28891c854982bb68998b78ce08db383eae6f3a9d2"

RPROVIDES:${PN} += "rsstail"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmrss.so.0"

inherit rpm
