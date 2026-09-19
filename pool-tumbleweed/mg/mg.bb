SUMMARY = "Micro GNU Emacs clone"
DESCRIPTION = "Mg is micro GNU Emacs clone without lisp interpreter."
LICENSE = "Unlicense"

PV = "3.7"

RPM_NAME = "mg-3.7-1.11.aarch64.rpm"
RPM_HASH = "8330b44dc6f351a4b6b5d88a41766970965355ba2846d0c0a9b9f09833959a35def13309bcb5352ab31c0a4c93bbc2e2d22da51868735b791aaa65fbe004befc"

RPROVIDES:${PN} += "mg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
