SUMMARY = "Kurdi (Kurdî, كوردی‎) Dictionary for Aspell"
DESCRIPTION = "A Kurdi (Kurdî, كوردی‎) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "aspell-ku-0.20.1-4.7.aarch64.rpm"
RPM_HASH = "27851a79850ae884d9b41243311f2e5b3b569dbecf4a6e2096f3169924fb7920fba25d616b910867b8174b22dbc60a3be855103b43fc705a3a40e9a8ebc5ba33"

RPROVIDES:${PN} += "aspell-ku \
locale-aspell-ku"

RDEPENDS:${PN} += ""

inherit rpm
