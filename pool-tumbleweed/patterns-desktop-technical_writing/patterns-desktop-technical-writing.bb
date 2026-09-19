SUMMARY = "Technical Writing"
DESCRIPTION = "Authoring tools and editors for creating technical documentation."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-technical_writing-20201106-5.5.aarch64.rpm"
RPM_HASH = "332fb56b737970bb06ae14242ec677d2e7e34fcd54b4be93f61d179289135a5c7e071423e7b040eac9e2d9b77a18823878294bee9f65676ccd38bee7f091eac3"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-desktop-technical-writing \
patterns-openSUSE-technical-writing"

RDEPENDS:${PN} += ""

inherit rpm
