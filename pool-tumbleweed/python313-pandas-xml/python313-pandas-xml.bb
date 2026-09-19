SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-xml-3.0.5-2.2.noarch.rpm"
RPM_HASH = "4dde2432d65bd9c99bb528c32bd88e0c4b17e0049c418c40906d036fb6353ad3d2d0473bb0c2a079988935eeb909e8c009f07c7b868dba38f22b5ea4c2d03a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-xml \
python313-pandas-xml"

RDEPENDS:${PN} += "python313-lxml \
python313-pandas"

inherit rpm
