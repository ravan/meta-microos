SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.1.1"

RPM_NAME = "python314-FormEncode-2.1.1-1.5.noarch.rpm"
RPM_HASH = "66343fa88e115d747dd698570e5714ff5a57384c621939c19ce28492da3f5df14dc02130868d1d4e853769fbfd2301d51805e16c33bfa0d236459f5de76c6ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-formencode \
python314-FormEncode \
python3dist-formencode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
