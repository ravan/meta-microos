SUMMARY = "Turkish (Türkçe) Dictionary for Aspell"
DESCRIPTION = "A Turkish (Türkçe) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-tr-0.50-4.7.aarch64.rpm"
RPM_HASH = "5e3d964435c17e9927fb77fb44374da8cc2732ed08eb83a609590f0f5f1515c22de688c69621b6e52e37715c36fca7fcbf2249ab8a0c61652662c3bd6bf414f7"

RPROVIDES:${PN} += "aspell-tr \
locale-aspell-tr"

RDEPENDS:${PN} += ""

inherit rpm
