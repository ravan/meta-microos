SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.11.3"

RPM_NAME = "python313-ipyvuetify-1.11.3-1.2.noarch.rpm"
RPM_HASH = "261762e70356f18f3f9aeacd752adbedaceb6afe3d6450e2e60417536877ad21aacabd1f1ead940956440aa7a358f6e0cfc11b3f9e6df56db90aac619be998fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvuetify \
python3.13dist-ipyvuetify \
python313-ipyvuetify \
python3dist-ipyvuetify"

RDEPENDS:${PN} += "-python313-ipyvue >= 1.7 with python313-ipyvue < 2 \
python-abi"

inherit rpm
