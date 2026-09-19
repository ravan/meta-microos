SUMMARY = "An URL extractor/viewer"
DESCRIPTION = "urlview presents a menu of all URLs from a given text file (e.g., a \
mail). The user may then view the information located on those URLs."
LICENSE = "GPL-2.0+"

PV = "0.9"

RPM_NAME = "urlview-0.9-734.9.aarch64.rpm"
RPM_HASH = "755e8faa1f5647930cb876393ed4e8a011725f3a49d0f42af87f09865b6325dedd1221cff0d006cf928b04991d9d3f0e910f353aebd4b5c06df15dd6334205a8"

RPROVIDES:${PN} += "config-urlview \
urlview"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
