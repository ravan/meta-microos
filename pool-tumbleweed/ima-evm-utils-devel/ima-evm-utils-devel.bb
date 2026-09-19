SUMMARY = "Development files for the IMA/EVM control utility library"
DESCRIPTION = "This package contains the header files and the utilities for ima-evm-utils."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later-with-Linux-syscall-note & LicenseRef-GPL-2.0-with-openssl-exception"

PV = "1.6.2"

RPM_NAME = "ima-evm-utils-devel-1.6.2-1.9.aarch64.rpm"
RPM_HASH = "7a4430cd4988696c3ff7319fa80e6480051e2fcb22b3ee086287e8fa09033534c43ce3127158a523a937de1233473342768465dd009a1d04e3422eae2a792785"

RPROVIDES:${PN} += "ima-evm-utils-devel"

RDEPENDS:${PN} += "libimaevm5 \
openssl-devel"

inherit rpm
