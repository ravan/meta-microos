SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python311-cauldron-notebook-1.0.9-3.2.noarch.rpm"
RPM_HASH = "efb3e943924506a3d6c789ce91ed554e36e663bf0194eca79f68e1f412738038c08e53134d034132db41184bd7e12384a9f09b335ce3328312bcd5bbed3d08c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cauldron-notebook \
python3.11dist-cauldron-notebook \
python311-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Flask \
python311-Jinja2 \
python311-Markdown \
python311-beautifulsoup4 \
python311-numpy \
python311-pandas \
python311-pygments \
python311-requests \
python311-waitress \
update-alternatives"

inherit rpm
