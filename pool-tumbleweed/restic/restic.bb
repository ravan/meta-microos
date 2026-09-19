SUMMARY = "Backup program with deduplication and encryption"
DESCRIPTION = "restic is a backup program. It supports verification, encryption, \
snapshots and deduplication."
LICENSE = "BSD-2-Clause"

PV = "0.19.1"

RPM_NAME = "restic-0.19.1-1.2.aarch64.rpm"
RPM_HASH = "9c2c95ca29e154c34f93b7232bf4fabd9b5c36dac33262cd61a7e18fe80d7814f587b5aa2a9822740b8b11d6b6dff078703caa9f658420d49c782dd546320b6f"

RPROVIDES:${PN} += "restic"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
