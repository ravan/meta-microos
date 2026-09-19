SUMMARY = "An RCS file annotator"
DESCRIPTION = "Blame displays the last modification for each line in an RCS file. \
It is the RCS equivalent of CVS's 'annotate' command."
LICENSE = "GPL-2.0-only"

PV = "1.4+t20260222"

RPM_NAME = "blame-1.4+t20260222-1.4.aarch64.rpm"
RPM_HASH = "8a2bde236206c587a45e1cdb4a53830a6578924664476c745b1ba949f7c1f52a68dfbc24c1e1927c6c2ba23c028e49529b6a862b00ee9c7bb2d4910e4ab80ccc"

RPROVIDES:${PN} += "blame"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
