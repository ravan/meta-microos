SUMMARY = "Croatian (hrvatski) Dictionary for Aspell"
DESCRIPTION = "A Croatian (hrvatski) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.51.0"

RPM_NAME = "aspell-hr-0.51.0-4.7.aarch64.rpm"
RPM_HASH = "40097c32c3dc8786aff1defba9e91935e12cee0190065d309ad7081f1a69963632af8ad853a48bc65f2e9d76b11e43dc4f64984a52f140f9b7abd60e14428796"

RPROVIDES:${PN} += "aspell-hr \
locale-aspell-hr"

RDEPENDS:${PN} += ""

inherit rpm
