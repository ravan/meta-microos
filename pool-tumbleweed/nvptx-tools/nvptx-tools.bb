SUMMARY = "PTX language tools"
DESCRIPTION = "A collection of tools for use with nvptx-none (NVIDIA Parallel Thread \
Execution) GCC toolchains. \
 \
* nvptx-none-as: 'assembler' for PTX. \
* nvptx-none-ld: 'linker' for PTX. \
* nvptx-none-run: run PTX binaries compiled with -mmainkernel."
LICENSE = "GPL-3.0-or-later"

PV = "1.0+git.20260402.212da2e"

RPM_NAME = "nvptx-tools-1.0+git.20260402.212da2e-1.3.aarch64.rpm"
RPM_HASH = "dc5085056c6f69e74bedc5a28bac597f0958f337d32129c793759d7fc7734dfb927f0cc51cc29424540651977620c218adc91b0032935855f99ae39dbec058eb"

RPROVIDES:${PN} += "nvptx-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
