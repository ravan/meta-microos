SUMMARY = "LibreOffice Writer Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Writer: \
 \
- MediaWiki Publisher"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-writer-extensions-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "daf218e1759cf10100a7b92c19223ae5841957a3ee25347f5e11b7561de3c4c40c0cec79635bae94fb432ad143560c812b486f20516f36e603230caa1e5702af"

RPROVIDES:${PN} += "libreoffice-writer-extensions"

RDEPENDS:${PN} += "jre \
libreoffice \
libreoffice-writer"

inherit rpm
