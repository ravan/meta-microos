SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "Once you enable this extension, a very simple string like this: \
 \
    'Alice -> Bob: Hi!' \
 \
will create a nice UML schema. WIth PlantUML, you can specify things like height, width, scale, caption and so on. For details, please see PlantUML documentation at: http://plantuml.sourceforge.net/."
LICENSE = "BSD-2-Clause"

PV = "0.31"

RPM_NAME = "python313-sphinxcontrib-plantuml-0.31-1.3.noarch.rpm"
RPM_HASH = "c55a254e4c19a765f02030da985e40ed30bc4ff4dbbc97f530f66410738688ccff44b01c1d01e6a0dd24ee098a3f65e6d2452f1139b424bad14d82bb37d56371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-plantuml \
python3.13dist-sphinxcontrib-plantuml \
python313-sphinxcontrib-plantuml \
python3dist-sphinxcontrib-plantuml"

RDEPENDS:${PN} += "plantuml \
python-abi \
python313-Sphinx"

inherit rpm
