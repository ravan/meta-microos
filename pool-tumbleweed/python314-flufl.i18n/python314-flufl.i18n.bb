SUMMARY = "High level API for internationalizing Python libraries and applications"
DESCRIPTION = "High level API for internationalizing Python libraries and applications."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python314-flufl.i18n-6.0.0-1.3.noarch.rpm"
RPM_HASH = "84caff9c074ff67c0250130468c559b642329bc78ee11be6b09892aceb63024c33cbc7d9dc7d44ffb159848a9b3791c649bb9b48dab7e064e1d6413ffa2c78b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flufl.i18n \
python314-flufl.i18n \
python3dist-flufl.i18n"

RDEPENDS:${PN} += "python-abi \
python314-atpublic"

inherit rpm
