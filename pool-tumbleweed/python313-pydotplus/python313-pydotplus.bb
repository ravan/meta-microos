SUMMARY = "Python interface to Graphviz's Dot language"
DESCRIPTION = "PyDotPlus is an improved version of the old pydot project that provides a \
Python Interface to Graphviz's Dot language."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python313-pydotplus-2.0.2-4.5.noarch.rpm"
RPM_HASH = "70232ef0162bc3dd2c6ddcd8ec570865a212f75ab78645e3ae1c0d35862f6b7ea3e2d00798a79f35885387d760f335e1684a55dac03a0c09fb698977aa0fb652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydotplus \
python3.13dist-pydotplus \
python313-pydotplus \
python3dist-pydotplus"

RDEPENDS:${PN} += "graphviz \
python-abi \
python313-pyparsing"

inherit rpm
