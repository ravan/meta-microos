SUMMARY = "GAP: IO Capabilities for the homalg Project"
DESCRIPTION = "The IO_ForHomalg package launches the command-line-interface of an \
external computer algebra system and connects it to homalg using an \
Input/Output stream."
LICENSE = "GPL-2.0-only"

PV = "2025.12.01"

RPM_NAME = "gap-io_forhomalg-2025.12.01-1.2.noarch.rpm"
RPM_HASH = "53b1559bc3e97e8fd4da0e1b6101e392133a2273b6f85dc172f466b73f82eec2279629ff83bb920c42fc17e1c70efff3bc3a7ce7b591206fac14371973fd333a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-io-forhomalg"

RDEPENDS:${PN} += "gap-core \
gap-homalgtocas \
gap-io"

inherit rpm
