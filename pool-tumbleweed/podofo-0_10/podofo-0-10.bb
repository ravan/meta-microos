SUMMARY = "Tools to work with PDF files"
DESCRIPTION = "Command line tools for working with PDF files."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.5"

RPM_NAME = "podofo-0_10-0.10.5-1.8.aarch64.rpm"
RPM_HASH = "46789f2dca6232671844cce4b2e7f32bedf545bb23dd04a820e4b732b89a1f69e359272bcd52128a4e9aa6caa5efd154fc03751281870fb8270ee5f5ec8c8636"

RPROVIDES:${PN} += "podofo-0-10"

RDEPENDS:${PN} += ""

inherit rpm
