SUMMARY = "Python library for serializing any arbitrary object graph into JSON"
DESCRIPTION = "Python library for serializing any arbitrary object graph into JSON. \
It can take almost any Python object and turn the object into JSON. \
Additionally, it can reconstitute the object back into Python."
LICENSE = "BSD-3-Clause"

PV = "4.1.2"

RPM_NAME = "python313-jsonpickle-4.1.2-3.1.noarch.rpm"
RPM_HASH = "66612062b88191c5d8483eb94e1995dafa3f43a65976ad6fbf0896666fd2bac355c8261532b85c63c0caf9d8f5f66c59882cc1fea368828b8d704b1ef6a042ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpickle \
python3.13dist-jsonpickle \
python313-jsonpickle \
python3dist-jsonpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
