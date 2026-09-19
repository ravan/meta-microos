SUMMARY = "Serbian (српски) Dictionary for Aspell"
DESCRIPTION = "A Serbian (српски) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.02"

RPM_NAME = "aspell-sr-0.02-4.7.aarch64.rpm"
RPM_HASH = "11fd224e63a9e1bca3f7a4eb3049463fb5fe809cb3e059f7dae6f65459287cded1d8441899fafa77a8771c0c260f841683e8c7753c78d1416eed5df797342b12"

RPROVIDES:${PN} += "aspell-sr \
locale-aspell-sr"

RDEPENDS:${PN} += ""

inherit rpm
