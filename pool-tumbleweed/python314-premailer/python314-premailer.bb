SUMMARY = "Turns CSS blocks into style attributes"
DESCRIPTION = "Premailer is a Python library based on libxml which can analyze a \
HTML document and extract its CSS style sheets and then for all \
CSS seletors defined, it finds the DOM nodes and puts style \
attributes in instead."
LICENSE = "Python-2.0"

PV = "3.10.0"

RPM_NAME = "python314-premailer-3.10.0-2.5.noarch.rpm"
RPM_HASH = "0f209bab16c6a7c14bbfe2bd0682baf01fa1192d80113f750f83bfd62a4e79aea8b14e7185c6927a9c2961c4b81c4a3960e00868cb02f3809c663de96be91db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-premailer \
python314-premailer \
python3dist-premailer"

RDEPENDS:${PN} += "python-abi \
python314-cachetools \
python314-cssselect \
python314-cssutils \
python314-lxml \
python314-requests"

inherit rpm
