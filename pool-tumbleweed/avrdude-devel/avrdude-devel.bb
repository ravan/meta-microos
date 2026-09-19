SUMMARY = "Development files for avrdude"
DESCRIPTION = "This package contains development files for avrdude."
LICENSE = "GPL-2.0-or-later"

PV = "8.0"

RPM_NAME = "avrdude-devel-8.0-2.7.aarch64.rpm"
RPM_HASH = "e4a2fd49be6c69fbca594fadae7771722cfc0bbdc38075c7c23e06cb400560a2646c7dee6f7d11f4d1de9203a36a14ddf31c577c55d1c754621bb40892088185"

RPROVIDES:${PN} += "avrdude-devel"

RDEPENDS:${PN} += "avrdude"

inherit rpm
