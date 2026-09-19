SUMMARY = "Intel pf baseband config tool for ACC100/ACC200/AGX100 accelerator cards"
DESCRIPTION = "The Physical Function (PF) Baseband Device (BBDEV) Configuration Application \
(pf_bb_config) from Intel to setup the ACC100/ACC200/AGX100 accelerator \
cards. \
The program accesses the configuration space and sets various parameters \
through memory-mapped I/O (MMIO) reads and writes."
LICENSE = "Apache-2.0"

PV = "25.11"

RPM_NAME = "pf-bb-config-25.11-1.3.aarch64.rpm"
RPM_HASH = "add7708578bd6efab84094c1584eccac6b16c4a157c72d80a5dc3b4b959d1d112b5fbf98c9779e9fd1ce656ced6087e55eb479ffb22dcf41cc324f56be5c4400"

RPROVIDES:${PN} += "pf-bb-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
