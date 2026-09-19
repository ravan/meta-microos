SUMMARY = "Python interface to Graphviz's Dot language"
DESCRIPTION = "PyDotPlus is an improved version of the old pydot project that provides a \
Python Interface to Graphviz's Dot language."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python314-pydotplus-2.0.2-4.5.noarch.rpm"
RPM_HASH = "831f722428e8cfb140eb13168f3070a63582c62b8eea11b92271e5ef00c4bb24f1bdccd6ab72da721fe0ca5825f3e8d3d652747b1dd206a637e8a79a9812508a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydotplus \
python314-pydotplus \
python3dist-pydotplus"

RDEPENDS:${PN} += "graphviz \
python-abi \
python314-pyparsing"

inherit rpm
