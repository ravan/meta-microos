SUMMARY = "Indentation of Source Code in various styles"
DESCRIPTION = "Indent can be used to make code easier to read. It can also convert \
from one style of writing C code to another. indent understands a \
substantial amount of C syntax, but it also tries to cope with \
incomplete and malformed syntax."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "indent-2.2.13-3.11.aarch64.rpm"
RPM_HASH = "177b0eb09228e7904c5c583d9bf5f3b109e838396cb85449c91fdbc31d7158215d68ccf6a97b34d407db923ab620d04ef5f5ff24e49e95aa4fb50fcbba7e9ad3"

RPROVIDES:${PN} += "indent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
