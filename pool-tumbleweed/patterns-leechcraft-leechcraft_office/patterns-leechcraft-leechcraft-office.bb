SUMMARY = "leechcraft_office"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_office-20170319-1.24.aarch64.rpm"
RPM_HASH = "50c865f45cdd5b24bba5df23978b5543f137ee671517d0b27287708422c7371d5a8e1aeeac43897bf4ff0a78b91b6fbd23614ef33a21a3f78f577e72a19382da"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-leechcraft-leechcraft-office"

RDEPENDS:${PN} += "leechcraft \
pattern-"

inherit rpm
