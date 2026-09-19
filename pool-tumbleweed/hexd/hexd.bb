SUMMARY = "Colourful, human-friendly hexdump tool"
DESCRIPTION = "hexd prints a human-readable hexdump of the specified files, or \
standard input if omitted. Its main distinguishing feature is \
the use of colours to visually indicate which range of values \
an octet belongs to, aiding in spotting patterns in binary data."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "hexd-1.1.0-1.16.aarch64.rpm"
RPM_HASH = "a599543935c85f015acd71cc6b9d602cca9ba6d4c0aee93abc83d74206ede16d8ce26a5df4fb670d5620a3b70f116fe644793c96b0ca9437dce36272b700c900"

RPROVIDES:${PN} += "hexd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
