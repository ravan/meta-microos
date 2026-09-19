SUMMARY = "Estonian (eesti) Dictionary for Aspell"
DESCRIPTION = "An Estonian (eesti) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.21"

RPM_NAME = "aspell-et-0.1.21-4.7.aarch64.rpm"
RPM_HASH = "fce350f85ac84e468a8d62036b94062c5e5688d790798fbe5a53e7dcc97c01e3e6d9c73c93e24eef66bf0f3bad32946b21eadf815b112e8153f035f7123d0e65"

RPROVIDES:${PN} += "aspell-et \
locale-aspell-et"

RDEPENDS:${PN} += ""

inherit rpm
