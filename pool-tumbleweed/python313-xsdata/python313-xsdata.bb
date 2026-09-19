SUMMARY = "Python XML Binding"
DESCRIPTION = "Python XML Binding"
LICENSE = "MIT"

PV = "26.2"

RPM_NAME = "python313-xsdata-26.2-1.3.noarch.rpm"
RPM_HASH = "4f1ac0254bede85dece68a2efde7a775f7cb530fd6aecf18c988bde84f8e7b9d792311ae6245f7866ff0b97586da053a3f98f667e4d367bab7a1b53ad9251497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsdata \
python3.13dist-xsdata \
python313-xsdata \
python3dist-xsdata"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-typing-extensions \
update-alternatives"

inherit rpm
