SUMMARY = "Scientific Analysis Environment"
DESCRIPTION = "Interactive computing for complex data processing, \
modeling and analysis in Python."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python313-cauldron-notebook-1.0.9-3.9.noarch.rpm"
RPM_HASH = "ac888ac7c531be93711567a57722ea93cde15a81e7e2ef0cbe758b2154ee0d117287f697b72566a478ecd3f0831a9b5cb02ea87809a1932378dc3a93b922ba54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cauldron-notebook \
python3.13dist-cauldron-notebook \
python313-cauldron-notebook \
python3dist-cauldron-notebook"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Flask \
python313-Jinja2 \
python313-Markdown \
python313-beautifulsoup4 \
python313-numpy \
python313-pandas \
python313-pygments \
python313-requests \
python313-waitress \
update-alternatives"

inherit rpm
