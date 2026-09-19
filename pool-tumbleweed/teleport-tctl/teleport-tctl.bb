SUMMARY = "CLI tool for managing a teleport server"
DESCRIPTION = "An administrative tool that can configure Teleport Auth Service."
LICENSE = "Apache-2.0"

PV = "17.7.26"

RPM_NAME = "teleport-tctl-17.7.26-1.4.aarch64.rpm"
RPM_HASH = "af0e6e9d5bbecc1c24abe8b91c5744b60d565350b0fe582fba1609c37f3835afdd9c18f4c977b0d81792599e27e4e3136b0ac3cbe22bddcd119f20e3d6e3a3f9"

RPROVIDES:${PN} += "teleport-tctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
