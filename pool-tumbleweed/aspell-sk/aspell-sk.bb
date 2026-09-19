SUMMARY = "Slovak (slovenský) Dictionary for Aspell"
DESCRIPTION = "A Slovak (slovenský) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-only | LGPL-2.1-only | MPL-1.1"

PV = "2.01"

RPM_NAME = "aspell-sk-2.01-4.7.aarch64.rpm"
RPM_HASH = "42ace3e4b130f9c59b5d602cdbe526e6c046d346e2489fce02a7733afc267d165d4a0ad0bcf2fe2bf2133b3b5b69c341ddb392e0ea4994b1fcd8fa632813ffc0"

RPROVIDES:${PN} += "aspell-sk \
locale-aspell-sk"

RDEPENDS:${PN} += ""

inherit rpm
