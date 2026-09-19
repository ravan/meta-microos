SUMMARY = "Ordered Multivalue Dictionary"
DESCRIPTION = "Ordered Multivalue Dictionary - omdict."
LICENSE = "Unlicense"

PV = "1.0.2"

RPM_NAME = "python314-orderedmultidict-1.0.2-1.3.noarch.rpm"
RPM_HASH = "57ebcd8aef500c54ae710dfeeeb3f0e65e9c1961a38211b88288b984e836eaf3fa5194da5500f17f0159139664deb1aa0a1a8455cbdcd310a4d68d685e079034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-orderedmultidict \
python314-orderedmultidict \
python3dist-orderedmultidict"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
