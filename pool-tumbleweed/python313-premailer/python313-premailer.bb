SUMMARY = "Turns CSS blocks into style attributes"
DESCRIPTION = "Premailer is a Python library based on libxml which can analyze a \
HTML document and extract its CSS style sheets and then for all \
CSS seletors defined, it finds the DOM nodes and puts style \
attributes in instead."
LICENSE = "Python-2.0"

PV = "3.10.0"

RPM_NAME = "python313-premailer-3.10.0-2.5.noarch.rpm"
RPM_HASH = "de8f7323491cd0c9b82b89ebf3de3b413723603e64ee4bd67d20492623bce94a626ef9b5e47ed0aff934fe2b6783bf245ca903cf52a1a25b470a1ad369fb848e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-premailer \
python3.13dist-premailer \
python313-premailer \
python3dist-premailer"

RDEPENDS:${PN} += "python-abi \
python313-cachetools \
python313-cssselect \
python313-cssutils \
python313-lxml \
python313-requests"

inherit rpm
