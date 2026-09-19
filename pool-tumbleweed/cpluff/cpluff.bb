SUMMARY = "A plug-in framework for C"
DESCRIPTION = "C-Pluff is a plug-in framework for C programs. It has been strongly inspired by \
the Java plug-in framework in Eclipse. C-Pluff focuses on providing core \
services for plug-in interaction and plug-in management. It aims to be platform \
neutral and supports dynamic changes to plug-in configuration without stopping \
the whole application or framework."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "cpluff-0.2.1-1.5.aarch64.rpm"
RPM_HASH = "55b722bd32b8c40210ba2193bdfb517c716f3f2acee0b767f133515f95ed48f9ef8b8348329feb4332fe8c3bf6ca96a87f761a737de20fefa6e1a719c243ca74"

RPROVIDES:${PN} += "cpluff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpluff.so.0 \
libreadline.so.8"

inherit rpm
