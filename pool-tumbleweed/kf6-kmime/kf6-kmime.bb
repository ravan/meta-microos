SUMMARY = "Library to assist handling MIME data"
DESCRIPTION = "KMime is a library for handling mail messages and newsgroup articles."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kmime-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "ccfad7c0b804c0633b0e946c2290d7487e174e7a7c4f84230e6739f1c7d568e62e6768f4a51cea2e9d26d5c1747c0a0495da3a158f2021a774542b7ed4c0e97f"

RPROVIDES:${PN} += "kf6-kmime \
kmime"

RDEPENDS:${PN} += ""

inherit rpm
