SUMMARY = "Devel package for libtextstyle"
DESCRIPTION = "This package provides headers and static libraries for libtextstyle"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "libtextstyle-devel-1.0-2.4.aarch64.rpm"
RPM_HASH = "765d245b4e32e7cc13e4a01a5ec84b4145bb7053ce32f5ca3938facd366f617b24431542853f7884a3053fb307eb43ffd783cdd216d216417cabb91acb4ca66b"

RPROVIDES:${PN} += "libtextstyle-devel"

RDEPENDS:${PN} += "libtextstyle0"

inherit rpm
