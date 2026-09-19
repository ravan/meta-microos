SUMMARY = "Mellanox Firmware Burning and Diagnostics Tools"
DESCRIPTION = "This package contains a burning tool and diagnostic tools for Mellanox \
manufactured HCA/NIC cards. It also provides access to the relevant \
source code. Please see the file LICENSE for licensing details. \
 \
This package is based on a subset of the Mellanox Firmware Tools (MFT) \
package. For a full documentation of the MFT package, please refer to \
the downloads page at the Mellanox web site."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "4.33.0"

RPM_NAME = "mstflint-4.33.0-1.5.aarch64.rpm"
RPM_HASH = "6dfc08812b26bec076b56f462f2e147ff5ea9c46753ffa90006542c874c64479c516f8428f3b90e779157f435b92af3942ac2a46e4fd78c4c106d44981b473c1"

RPROVIDES:${PN} += "libresource-dump-sdk.so \
mstflint"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
