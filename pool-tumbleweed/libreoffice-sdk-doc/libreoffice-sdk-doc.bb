SUMMARY = "LibreOffice SDK Documentation"
DESCRIPTION = "This package includes documentation and examples for the LibreOffice \
Software Development Kit (SDK)."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-sdk-doc-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "95e9d139abdf06f2636530aeb791b72ec3ec4ee4b96f0f9d30ea24846a4e8dc6ef92dbb57cb47820980d3d64156c1c072767dbc9e86c94487b434031d3899618"

RPROVIDES:${PN} += "libreoffice-sdk-doc \
libreoffice-ure-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
