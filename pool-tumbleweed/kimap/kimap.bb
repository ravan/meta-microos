SUMMARY = "Library to assist working with IMAP servers"
DESCRIPTION = "KIMAP provides libraries to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kimap-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "db1fa3cc8f116429d216344eee4aead72bf7e789a84334ad0ea0e7ff1cede30155fe9f810e68ae08e1379652bef75ec461fb0d913389c3031cd4fba7909d40da"

RPROVIDES:${PN} += "kimap"

RDEPENDS:${PN} += ""

inherit rpm
