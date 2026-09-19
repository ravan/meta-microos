SUMMARY = "GNU diff Utilities"
DESCRIPTION = "The GNU diff utilities find differences between files. diff is used to \
make source code patches, for instance."
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "3.12"

RPM_NAME = "diffutils-3.12-1.6.aarch64.rpm"
RPM_HASH = "de311b53c91c028b369ce6b8ede07cace3a9df42907bb9e34f762286dcf84d7690459ad61a815ea97786caeb78a39f654852b50d7265c7bb2e3ec92189d00b71"

RPROVIDES:${PN} += "diff \
diffutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
