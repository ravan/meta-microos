SUMMARY = "Generate source code for Python classes from a JSON schema"
DESCRIPTION = "Generate source code for Python classes from a JSON schema."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python313-jschema-to-python-1.2.3-3.5.noarch.rpm"
RPM_HASH = "4a233b1acc9a70cd36de0ab59b7a27f18b3e272fae69a61a828fff63eed2a2e888f6a1d5c82e75c84a0da45ed47103f72e8435a1d367157f99a27d8260ba519f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jschema-to-python \
python3.13dist-jschema-to-python \
python313-jschema-to-python \
python3dist-jschema-to-python"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-jsonpickle \
python313-pbr"

inherit rpm
