SUMMARY = "Document params, attributes, types and variables inline"
DESCRIPTION = "Document parameters, class attributes, return types, and variables inline, with `Annotated`."
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "python314-annotated-doc-0.0.4-1.4.noarch.rpm"
RPM_HASH = "cf73bb35f864217e3de0495d2b0cb4ee50a43e8b78e0f7ef47c018d1c68e2b32f3cc010b48cb47fbef415c5fe505cef61d4044dca9dbf8ad1e887ff37636af4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-annotated-doc \
python314-annotated-doc \
python3dist-annotated-doc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
