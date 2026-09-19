SUMMARY = "Romanian (română) Dictionary for Aspell"
DESCRIPTION = "A Romanian (română) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "aspell-ro-3.3.2-4.7.aarch64.rpm"
RPM_HASH = "f34f1d9e8d6c44424f16d1f4fb58dd498c06609c938cc9c9104f9c03390a039560c61eeb87e3358b081a421f0e47b3b1c79cff9eb95a771f3b9b24647142ad64"

RPROVIDES:${PN} += "aspell-ro \
locale-aspell-ro"

RDEPENDS:${PN} += ""

inherit rpm
