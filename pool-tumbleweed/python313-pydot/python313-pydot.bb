SUMMARY = "Module to create (dot) graphs from Python"
DESCRIPTION = "pydot allows to create both directed and non-directed graphs from \
Python. All attributes implemented in the Dot language up to Graphviz \
2.16 are supported."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "python313-pydot-4.0.1-1.4.noarch.rpm"
RPM_HASH = "b54cb0b859c182d44ec90ba29827d6ce33a1603cf64847e4785048b74c4f5fcebcc1e52d915a32117d1c7c2bb93b83d325d671ec8cd5f97fc7be71d80bf8d3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydot \
python3.13dist-pydot \
python313-pydot \
python3dist-pydot"

RDEPENDS:${PN} += "dejavu-fonts \
graphviz \
graphviz-gd \
python-abi \
python313-pyparsing"

inherit rpm
