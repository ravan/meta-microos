SUMMARY = "WoodpeckerCI server"
DESCRIPTION = "Woodpecker is a simple yet powerful CI/CD engine with great extensibility. This \
package contains the server binary and service."
LICENSE = "Apache-2.0"

PV = "3.18.0"

RPM_NAME = "woodpecker-server-3.18.0-1.1.aarch64.rpm"
RPM_HASH = "d4758fb94176b03ac4a19ba959c75cbefb0c554db2acf19fc319b231d4f2d91f6879a1a0c2fe282c5dad17ac9e9c4fbda183fce56c395e442f664f8c11329657"

RPROVIDES:${PN} += "config-woodpecker-server \
woodpecker-server"

RDEPENDS:${PN} += "/usr/bin/sh \
group-woodpecker \
libc.so.6 \
user-woodpecker"

inherit rpm
