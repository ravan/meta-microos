SUMMARY = "Python library for serializing any arbitrary object graph into JSON"
DESCRIPTION = "Python library for serializing any arbitrary object graph into JSON. \
It can take almost any Python object and turn the object into JSON. \
Additionally, it can reconstitute the object back into Python."
LICENSE = "BSD-3-Clause"

PV = "4.1.2"

RPM_NAME = "python314-jsonpickle-4.1.2-3.1.noarch.rpm"
RPM_HASH = "486d1a6bf30b380cce86305946dc8ff5570950663a0e2af2774eb2d4704e80e6f262cdd0da15657a362de0b2f2131da9bc1c4e8d434974554de7ace0b1535d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonpickle \
python314-jsonpickle \
python3dist-jsonpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
