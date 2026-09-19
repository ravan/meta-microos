SUMMARY = "Python video metadata parser"
DESCRIPTION = "Enzyme is a Python module to parse video metadata."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python314-enzyme-0.5.2-1.9.noarch.rpm"
RPM_HASH = "9efff885763e7be798c5dacb3414faa5f93b105ab681c24d1826de64bc6157bc1aaac6e8c0e2a878477649cbd7504ec38d47182eda009ae48ce3a1798e3aeda2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-enzyme \
python314-enzyme \
python3dist-enzyme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
