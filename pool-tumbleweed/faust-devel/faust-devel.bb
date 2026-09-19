SUMMARY = "Faust devel files"
DESCRIPTION = "Devel files for embedding the Faust compiler in to your own application."
LICENSE = "GPL-2.0-only"

PV = "2.88.0"

RPM_NAME = "faust-devel-2.88.0-1.1.aarch64.rpm"
RPM_HASH = "4e4cdc43ae1a4a9ba4efd4568b4cf9f636226b68bbaa68f573954f409f8a6a70e413e62d08ae55bf4b193ca42c3fd5a01f59d78dc37132d325c77754d2e6a21a"

RPROVIDES:${PN} += "faust-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
bash \
faust"

inherit rpm
