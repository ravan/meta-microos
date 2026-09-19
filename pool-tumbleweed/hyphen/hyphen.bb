SUMMARY = "A text hyphenation library"
DESCRIPTION = "Hyphen is a library for high quality hyphenation and justification."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MPL-1.1+"

PV = "2.8.9"

RPM_NAME = "hyphen-2.8.9-1.3.aarch64.rpm"
RPM_HASH = "c02080dfb05f6fd3d1289d9506d4898f3daa527c85d8f1a6c4a90734ec251880a7d31af4e6790e580148ca30d9f9004b98a359853c4a057fe748636e8e8d776a"

RPROVIDES:${PN} += "hyphen"

RDEPENDS:${PN} += ""

inherit rpm
