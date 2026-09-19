SUMMARY = "Command-line utility for storage conversions and calculations"
DESCRIPTION = "bcal (Byte CALculator) is a command-line utility for storage, hardware and \
firmware developers who deal with storage-specific numerical calculations, \
expressions, unit conversions or address calculations frequently. If you are one \
and cannot calculate the hex address offset for (512 - 16) MiB immediately, or \
the value when the 43rd bit of a 64-bit address is set, bcal is for you."
LICENSE = "GPL-3.0-only"

PV = "2.4"

RPM_NAME = "bcal-2.4-2.5.aarch64.rpm"
RPM_HASH = "090103eb5001a6e1769177ec381913ea6f112e55f3dbce255ce4e1b1b73ffbb882b7bd355caca0c91614c44693a9a7a76f0a81009c6b2080653b681ee329e1a6"

RPROVIDES:${PN} += "bcal"

RDEPENDS:${PN} += "libc.so.6 \
libreadline.so.8"

inherit rpm
