SUMMARY = "Geany documentation"
DESCRIPTION = "Geany's developers documentation"
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "geany-doc-2.1-1.7.aarch64.rpm"
RPM_HASH = "b1c0dde06bce9c2e036e621fc7782f44f1282a9747ae207091203661996d32bd614930e8ab6ce9d62b796245112e4d434b8cdf753aaa53bc75b06057eeff225f"

RPROVIDES:${PN} += "geany-doc"

RDEPENDS:${PN} += "geany"

inherit rpm
