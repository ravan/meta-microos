SUMMARY = "CLI tool for logging into nodes via Teleport SSH"
DESCRIPTION = "A tool that lets end users interact with Teleport nodes. This replaces ssh."
LICENSE = "Apache-2.0"

PV = "17.7.26"

RPM_NAME = "teleport-tsh-17.7.26-1.4.aarch64.rpm"
RPM_HASH = "c82c93ad00a7cd8cf4d8419493447860dfa89a98d335bf2204a650c75447b3eef2f5e049ffdb92429e3559738bf8a9408a96525d2ad763ed364c60a1b85801ca"

RPROVIDES:${PN} += "teleport-tsh"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
