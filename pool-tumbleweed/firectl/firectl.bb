SUMMARY = "Command-line tool to run Firecracker microVMs"
DESCRIPTION = "Firectl is a command-line tool to run Firecracker microVMs."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "firectl-0.2.0-1.19.aarch64.rpm"
RPM_HASH = "9c9484f7574e051651e75f86a0c95e3eafbf0091aed51925b7d4639a4f2ed0c3acea599c0c9e358df6f1c80407bb9d6b5c03116ce4dab9ac85242493e6668544"

RPROVIDES:${PN} += "firectl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
