SUMMARY = "Jupyter widgets based on vuetify UI components - nbextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.11.3"

RPM_NAME = "jupyter-ipyvuetify-nbextension-1.11.3-1.2.noarch.rpm"
RPM_HASH = "5a4accd46338693e37ef3a593a7320f95596cbe4791a1eeff0d2a5f9107cb81329f1c09426fc482a54a983a59a3b65a101697430266857e6552bc7de17badb25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvuetify-nbextension"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyvuetify"

inherit rpm
