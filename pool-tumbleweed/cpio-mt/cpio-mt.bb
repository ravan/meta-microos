SUMMARY = "Tape drive control utility"
DESCRIPTION = "This package includes the 'mt', a local tape drive control program."
LICENSE = "GPL-3.0-only"

PV = "2.15"

RPM_NAME = "cpio-mt-2.15-9.1.aarch64.rpm"
RPM_HASH = "cf4e0544bf3b4f36e1ccfecfa580d91b48518dc278c7ecab65b2b616c72f339b53c5fcd1cf69a8fb4e8071616e2a7f50137f759165d9817fa16c0c1d7508fb03"

RPROVIDES:${PN} += "cpio-mt \
mt"

RDEPENDS:${PN} += "/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
