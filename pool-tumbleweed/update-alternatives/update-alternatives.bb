SUMMARY = "Maintain symbolic links determining default commands"
DESCRIPTION = "update-alternatives creates, removes, maintains and displays \
information about the symbolic links comprising the alternatives \
system. It is possible for several programs fulfilling the same or \
similar functions to be installed on a single system at the same time. \
For example, many systems have several text editors installed at once. \
This gives choice to the users of a system, allowing each to use a \
different editor, if desired, but makes it difficult for a program to \
make a good choice of editor to invoke if the user has not specified a \
particular preference."
LICENSE = "GPL-2.0-or-later"

PV = "1.22.22"

RPM_NAME = "update-alternatives-1.22.22-1.3.aarch64.rpm"
RPM_HASH = "de72e547928246679173493236c4b58046160df2434642bb44b2c0dafa6f10e8678fb32e4138d9a1ca4c4aac8658e31d9495d5d5172ac44ea5c4474db39fd46c"

RPROVIDES:${PN} += "alternatives \
update-alternatives"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
