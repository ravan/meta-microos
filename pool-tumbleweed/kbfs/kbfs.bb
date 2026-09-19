SUMMARY = "Encrypted remote storage based on Keybase identities"
DESCRIPTION = "The Keybase filesystem provides encrypted remote storage. Encryption is \
handled transparently based on Keybase accounts. \
 \
In addition to plain file storage this also provides a possibility to \
host public files and store Git repositories."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "kbfs-6.6.3-4.1.aarch64.rpm"
RPM_HASH = "069c617bbb6914aaf5bb07040e93025d1e2295c249f690b445e55753bef6f8aa5951aa276828bc3f01785e2c5ceb11eba151f4b964084ad56fb4e5da6bbe7833"

RPROVIDES:${PN} += "kbfs"

RDEPENDS:${PN} += "/usr/bin/sh \
keybase-client"

inherit rpm
