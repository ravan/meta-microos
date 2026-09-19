SUMMARY = "DocBook-to-Texinfo Converter"
DESCRIPTION = "A new tool based on Perl modules."
LICENSE = "MIT"

PV = "0.8.8"

RPM_NAME = "docbook2x-doc-0.8.8-130.7.aarch64.rpm"
RPM_HASH = "9a21faf4488cae9215377ddaa686e2b99d1674506ce6b516505f3d0f5075f058e133c0bc57f2b3ec8d1bf3bf111d8bbc5f80d9c416cc25d304b370e66b20aed5"

RPROVIDES:${PN} += "docbook2x-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
