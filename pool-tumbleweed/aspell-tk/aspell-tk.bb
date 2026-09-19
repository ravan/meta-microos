SUMMARY = "Turkmen (Türkmençe) Dictionary for Aspell"
DESCRIPTION = "A Turkmen (Türkmençe) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-tk-0.01-4.7.aarch64.rpm"
RPM_HASH = "f14e3176f5b76fe8c69544d8f770e0d898e34c8daa4957c6ecfc878a2f6be70506c78b92f3be37197beda33b809d6dd4885943c17b5a2b0f9a07ef425d99ef91"

RPROVIDES:${PN} += "aspell-tk \
locale-aspell-tk"

RDEPENDS:${PN} += ""

inherit rpm
