SUMMARY = "Malayalam (മലയാളം) Dictionary for Aspell"
DESCRIPTION = "A Malayalam (മലയാളം) dictionary for the aspell spell checker."
LICENSE = "GPL-3.0-or-later"

PV = "0.03"

RPM_NAME = "aspell-ml-0.03-4.7.aarch64.rpm"
RPM_HASH = "13f0676605a5612b48b0a18ace2c78c94cd88a133977918e13b6634fca63a9c889c811ec50819f50bc2366511ccdc4c3cf824bcca8bcc89ddb0dbf1f54db13fc"

RPROVIDES:${PN} += "aspell-ml \
locale-aspell-ml"

RDEPENDS:${PN} += ""

inherit rpm
