SUMMARY = "An arbitrary-precision CRC calculator and algorithm finder"
DESCRIPTION = "CRC RevEng is an arbitrary-precision CRC calculator and \
algorithm finder. It calculates CRCs using any of the 72 preset \
algorithms, or a user-specified algorithm to any width. It calculates \
reversed CRCs to give the bit pattern that produces a desired forward \
CRC. CRC RevEng also reverse-engineers any CRC algorithm from \
sufficient correctly formatted message-CRC pairs and optional known \
parameters. It comprises input interpretation options. \
It is compliant with Ross Williams' Rocksoft model of parametrised CRC \
algorithms."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "reveng-3.0.6-1.3.aarch64.rpm"
RPM_HASH = "c67a3b722737e27d294194c722e515e4989baea612dbd6f6e97086d6112e0aba3fcca20443fddde3f2ac338d1111963e6c03a2aa8a2c558e2f8e5a79fa37673d"

RPROVIDES:${PN} += "reveng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
