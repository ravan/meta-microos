SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python312-cauldron-notebook-1.0.9-3.2.noarch.rpm"
RPM_HASH = "09ff80ab50ab3c6fb17f99280dc97499d78d49d37d81ff1edf3f798c669f82d2c97f712cffdf954134fea6eace866b33553a7cde5a7c7f39ca8874be3b804fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-cauldron-notebook \
python312-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
python-abi \
python312-Flask \
python312-Jinja2 \
python312-Markdown \
python312-beautifulsoup4 \
python312-numpy \
python312-pandas \
python312-pygments \
python312-requests \
python312-waitress \
update-alternatives"

inherit rpm
