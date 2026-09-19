SUMMARY = "Tools for libtracefs"
DESCRIPTION = "This library provides C APIs to access the kernel trace file system. \
 \
This subpackage contains tools."
LICENSE = "LGPL-2.1-only"

PV = "1.8.3"

RPM_NAME = "libtracefs-tools-1.8.3-1.3.aarch64.rpm"
RPM_HASH = "120c5f316acdc86732bfcebac90a2981b69c44f763824d2220b38d7f4121f7a26c85eb53559b08317e918c857e04ec38d7b9065d1b7cac4ca073576a178babf0"

RPROVIDES:${PN} += "libtracefs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1 \
libtracefs1"

inherit rpm
