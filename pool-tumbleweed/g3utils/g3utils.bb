SUMMARY = "Tools for the G3 (Fax) Graphics Format"
DESCRIPTION = "These utilities convert graphics files from the G3 format into the \
general- purpose PBM format and back, so you can print or manipulate \
them. G3 is used by fax modems and machines. \
 \
The g3utils are included in the mgetty source package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "g3utils-1.2.1-14.1.aarch64.rpm"
RPM_HASH = "36c414129485d46b88022f5072491afdab116ecd92acf965c1fd2bdda88b670eb95510db8341866f3ab1a6d4933fdfba939a33fa8f32f80af0f4416b140519e7"

RPROVIDES:${PN} += "g3utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
