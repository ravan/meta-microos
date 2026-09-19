SUMMARY = "Font compiler for the X server and font server"
DESCRIPTION = "bdftopcf is a font compiler for the X server and font server. Fonts \
in Portable Compiled Format can be read by any architecture, although \
the file is structured to allow one particular architecture to read \
them directly without reformatting. This allows fast reading on the \
appropriate machine, but the files are still portable (but read more \
slowly) on other machines."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "bdftopcf-1.1.2-1.8.aarch64.rpm"
RPM_HASH = "fbeee11abc635f36ded7d2ebfd01ecaf206b998b2fef6871ef4417820431457cb99fac829b527aafcbee5a6ba963df6d784d78264f0211aec9bcabc2009d8517"

RPROVIDES:${PN} += "bdftopcf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
