SUMMARY = "A tool to force swapped out pages back into memory"
DESCRIPTION = "Pagein is a tool that forces pages that are in swap to be paged in back \
to memory. The main usecase for pagein is to exercise the VM and swap \
subsystems for testing purposes."
LICENSE = "GPL-2.0-only"

PV = "0.01.11"

RPM_NAME = "pagein-0.01.11-1.7.aarch64.rpm"
RPM_HASH = "a0f439e43bb12afdb99736be44d9775754919bb4d695217232d3fba197deebc18e8d48fedcdb72e735f82c009ddd0ce08c2d20950d0e04f01a4b3cd074f979dd"

RPROVIDES:${PN} += "pagein"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
