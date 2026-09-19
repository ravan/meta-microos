SUMMARY = "Code page 437 emulator"
DESCRIPTION = "Cp437 is a program to emulate an old-style 'code page 437' / 'IBM-PC' character \
set terminal on a modern terminal emulator that uses UTF-8 or similar. \
 \
It was written for the purpose of running the BitchX IRC client, which utilises \
CP437 line-drawing characters in its default theme and artwork.  It should \
also be broadly useful for things like viewing CP437 'ANSI art', running \
nethack with the IBMgraphics option or running EPIC with scripts that use CP437 \
artwork."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "cp437-0.6-1.22.aarch64.rpm"
RPM_HASH = "470b25e18b87407306e836295557d49df62a5ee7e5d140ddb170689c38ebfd0af19b404cf887f588e318735bc0c6dbdc41f8c6c5678761009de7c4bb0ca9dc96"

RPROVIDES:${PN} += "cp437"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
