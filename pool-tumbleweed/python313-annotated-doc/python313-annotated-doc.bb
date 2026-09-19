SUMMARY = "Document params, attributes, types and variables inline"
DESCRIPTION = "Document parameters, class attributes, return types, and variables inline, with `Annotated`."
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "python313-annotated-doc-0.0.4-1.4.noarch.rpm"
RPM_HASH = "8b6a17bbe89a453026a510b42c0576587afa82bf7d0ba5734f70c1d453c4781fd089154c7ddbf729775b822bfb7e9573619f9a0d8312154a90d7911dd753f6ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-annotated-doc \
python3.13dist-annotated-doc \
python313-annotated-doc \
python3dist-annotated-doc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
