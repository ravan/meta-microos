SUMMARY = "High level API for internationalizing Python libraries and applications"
DESCRIPTION = "High level API for internationalizing Python libraries and applications."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python313-flufl.i18n-6.0.0-1.3.noarch.rpm"
RPM_HASH = "adced1711b40be9bac6ce8671c9627d21ca3f2910bf7e7b078a4802faef45fba5683a5117954fed5d1571bd2aa8c505d77c7075bce31e305517f8c2e367ace86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.i18n \
python3.13dist-flufl.i18n \
python313-flufl.i18n \
python3dist-flufl.i18n"

RDEPENDS:${PN} += "python-abi \
python313-atpublic"

inherit rpm
