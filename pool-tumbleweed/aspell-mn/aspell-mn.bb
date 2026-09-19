SUMMARY = "Mongolian (Монгол) Dictionary for Aspell"
DESCRIPTION = "A Mongolian (Монгол) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.06.2"

RPM_NAME = "aspell-mn-0.06.2-4.7.aarch64.rpm"
RPM_HASH = "eb130480b160cc997f1090f3aa5e538aba49178be4dcc377db05ae71eb39a52bab594ad53db08cf3670579aefe210e073056dc4756d8a5751fafade5a1396db2"

RPROVIDES:${PN} += "aspell-mn \
locale-aspell-mn"

RDEPENDS:${PN} += ""

inherit rpm
