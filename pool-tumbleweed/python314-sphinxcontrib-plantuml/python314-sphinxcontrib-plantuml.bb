SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "Once you enable this extension, a very simple string like this: \
 \
    'Alice -> Bob: Hi!' \
 \
will create a nice UML schema. WIth PlantUML, you can specify things like height, width, scale, caption and so on. For details, please see PlantUML documentation at: http://plantuml.sourceforge.net/."
LICENSE = "BSD-2-Clause"

PV = "0.31"

RPM_NAME = "python314-sphinxcontrib-plantuml-0.31-1.3.noarch.rpm"
RPM_HASH = "a6d4b8603018e3a515c8049ce46bf02a94df8918c6ab75dfeed511f3959d2d221c497084ccb47a75210f7773337b58d55c77d0098421ffebdf0118111a4aee52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-plantuml \
python314-sphinxcontrib-plantuml \
python3dist-sphinxcontrib-plantuml"

RDEPENDS:${PN} += "plantuml \
python-abi \
python314-Sphinx"

inherit rpm
