SUMMARY = "Scripts and data for building API documentation"
DESCRIPTION = "The kapidox framework enables the generation of API documentation from \
Doxygen-formatted codde comments in a standard format and style."
LICENSE = "BSD-2-Clause"

PV = "6.30.0"

RPM_NAME = "kf6-kapidox-6.30.0-1.1.noarch.rpm"
RPM_HASH = "53e7e90d75a5b62fc53e788872d311994ce819e9bcd88748d29b3063125793c6de26d7f44b2fd0d644fc73c56bc7250893ea2a62b8bddcd2109feac391d9138f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kapidox \
python3.13dist-kapidox \
python3dist-kapidox"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
doxygen \
graphviz \
graphviz-gd \
python-abi \
python3-Jinja2 \
python3-xml \
qt6-tools"

inherit rpm
