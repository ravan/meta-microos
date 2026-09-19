SUMMARY = "User-space driver for Mellanox BlueField SoC"
DESCRIPTION = "mlxbf-bootctl is used to control the two boot firmware partitions present on most Mellanox BlueField devices."
LICENSE = "BSD-2-Clause"

PV = "1.1.6.25"

RPM_NAME = "mlxbf-bootctl-1.1.6.25-1.8.aarch64.rpm"
RPM_HASH = "7826145491293e5e811f0c33051dbb8d0b98bb84dfedda26ec4adf4faa1209e7425152e854540cd47831cdebfde1e1e9d9d40c07acba0eed27986079426fa432"

RPROVIDES:${PN} += "mlxbf-bootctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
