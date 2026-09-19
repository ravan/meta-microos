SUMMARY = "Tool for converting texinfo documents to roff ones"
DESCRIPTION = "Tex­i2roff trans­lates tex­info doc­u­ments to nroff/troff (it does not deal \
with Plain TeX or LaTeX sources). While the conversion is not complete, it \
provides a solid basis for translating most texinfo documentation."
LICENSE = "SUSE-Permissive-Modify-By-Patch"

PV = "2.0"

RPM_NAME = "texi2roff-2.0-5.5.aarch64.rpm"
RPM_HASH = "17ab9d45c9e54762644e8f1df32c66b8f7d7a80761ec7f674f52a46e625ddb455617517dbf78b028c6163a78484aa2724d4a5825a42bfa589b629d66abd8a364"

RPROVIDES:${PN} += "texi2roff \
texinfo-/usr/bin/texi2roff"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
