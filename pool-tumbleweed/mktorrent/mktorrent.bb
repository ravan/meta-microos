SUMMARY = "Command line utility to create BitTorrent metainfo files"
DESCRIPTION = "Mktorrent can be used to create BitTorrent metainfo (.torrent) files from the \
command line."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "1.1"

RPM_NAME = "mktorrent-1.1-1.31.aarch64.rpm"
RPM_HASH = "e821f405e56bcf666788fb2a4a9a46f1b2bc76c4823f45c2199a46aedb4b4da5b6c3ae54d20dd707ebcbf3919a83b19dc521897fd5074f5322eda0a4fee7c5c5"

RPROVIDES:${PN} += "mktorrent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
