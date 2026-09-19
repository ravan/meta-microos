SUMMARY = "Tools to access Microsoft executable (EXE) format files"
DESCRIPTION = "Tools to access Microsoft executable (.exe) format files \
including PE/COFF formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libexe-tools-20260705-1.2.aarch64.rpm"
RPM_HASH = "30a0d08b8994616fd50c948df29e37e489be26511138d39580f48b9022a26acf466a856ba42b47faf0627bd2ac70d3911df838aa036c0714e95becaa0f36ee68"

RPROVIDES:${PN} += "libexe-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libexe.so.1"

inherit rpm
