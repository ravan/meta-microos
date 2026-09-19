SUMMARY = "MIME Mail Handler"
DESCRIPTION = "Metamail is required for reading multimedia mail messages (such as \
those using the Andrew toolkit) with elm."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.7.19"

RPM_NAME = "metamail-2.7.19-1277.7.aarch64.rpm"
RPM_HASH = "3065f0c1091aa1eeeb014f23630dfe7569b1f414a34ba4ddc459baee6392b5dfd6a43694eeff8bb87aec9091e65b4443d00f0c729785d09357677c603fbbfa2b"

RPROVIDES:${PN} += "metamail"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpipeline.so.1 \
libtinfo.so.6 \
sharutils"

inherit rpm
