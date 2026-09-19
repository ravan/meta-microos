SUMMARY = "A collection of simple type-1 font manipulation programs"
DESCRIPTION = "The t1utils are a collection of simple type-1 font manipulation programs. \
Together, they allow you to convert between PFA (ASCII) and PFB \
(binary) formats, disassemble PFA or PFB files into human-readable \
form, and reassemble them into PFA or PFB format. Additionally, you can \
extract font resources from a Macintosh font file (ATM/Laserwriter) or \
create a Macintosh Type 1 font file from a PFA or PFB font."
LICENSE = "ISC"

PV = "1.42"

RPM_NAME = "t1utils-1.42-1.19.aarch64.rpm"
RPM_HASH = "97195f9552e09004e51d0ea4e5fa2d2d97e2b14ca5a8759a651a39818a9fa541950e442e1a3d75144c5d4f462517a3161443221e0be66fdbc1a2a80b995305ac"

RPROVIDES:${PN} += "t1utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
