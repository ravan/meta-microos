SUMMARY = "Danish (dansk) Dictionary for Aspell"
DESCRIPTION = "A Danish (dansk) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.20"

RPM_NAME = "aspell-da-1.6.20-4.7.aarch64.rpm"
RPM_HASH = "98c4200b7524814e2f3d4503d2a4645a4d06f39c56496519b59794a1ca691b29d38db894c943be56d1d02edccb9503867a0696d1e0e3e28f8b863e13f8d4a3a7"

RPROVIDES:${PN} += "aspell-da \
locale-aspell-da"

RDEPENDS:${PN} += ""

inherit rpm
