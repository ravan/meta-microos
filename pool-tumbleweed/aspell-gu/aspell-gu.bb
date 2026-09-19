SUMMARY = "Gujarati (ગુજરાતી) Dictionary for Aspell"
DESCRIPTION = "A Gujarati (ગુજરાતી) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.03"

RPM_NAME = "aspell-gu-0.03-4.7.aarch64.rpm"
RPM_HASH = "a7ab4a1bfc7ab8675310a4583fa67cd797088e9abd8ade978ea014e66ad4bd611def07893ab45188ef075a45d4d2b012914d04d8531ebe331f3b8dc5f6906350"

RPROVIDES:${PN} += "aspell-gu \
locale-aspell-gu"

RDEPENDS:${PN} += ""

inherit rpm
