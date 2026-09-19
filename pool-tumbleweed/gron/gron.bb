SUMMARY = "Make JSON greppable"
DESCRIPTION = "gron transforms JSON into discrete assignments to make it easier \
to grep for what you want and see the absolute 'path' to it. It \
eases the exploration of APIs that return large blobs of JSON but \
have terrible documentation."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "gron-0.7.1-1.24.aarch64.rpm"
RPM_HASH = "fd7c08ec29371b1b40aeef1bc4d51164db6a3cc731913803a48353824baf7a0beda88827dda4ad44963d5fd7ca8362bb186b8a59f58a40a0ece12925056da62c"

RPROVIDES:${PN} += "gron"

RDEPENDS:${PN} += ""

inherit rpm
