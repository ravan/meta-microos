SUMMARY = "Utilities for Persistent Memory"
DESCRIPTION = "The Persistent Memory Development Kit (PMDK) is a collection of \
libraries and tools built on the DAX (Direct Access) feature of the \
Linux kernel which allows applications to access persistent memory as \
memory-mapped files, as described in the SNIA NVM Programming Model. \
 \
* pmempool: utility for administration and diagnosis  of PMDK pools \
* pmreorder: Python scripts to parse and replay operations logged by pmemcheck \
* daxio: utility to perform I/O on DAX devices"
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "pmdk-tools-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "beb72d701a167002e8d0fd65beaaa0ff30539fdd8177fe82ad5f0626109a36509323899f687e13220295621ea41ebb9b9f62bbabc8e2eca7a815940996f7c9d4"

RPROVIDES:${PN} += "nvml-tools \
pmdk-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1 \
libpmemobj.so.1 \
libpmempool.so.1"

inherit rpm
