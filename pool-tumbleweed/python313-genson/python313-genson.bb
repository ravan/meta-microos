SUMMARY = "Python JSON Schema generator"
DESCRIPTION = "GenSON is a JSON Schema generator. \
 \
Besides taking JSON objects and generating schemas that describe \
them, this generator is able to merge schemas as well."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-genson-1.3.0-1.6.noarch.rpm"
RPM_HASH = "f384ff859e3380df06a82d7a26f94aaee018e14f87436eb47965ff33cfd727ce12b026e4e1c48a5959e115e0622eb962823b80081c66316fc3b93c8889dd9c31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-genson \
python3.13dist-genson \
python313-genson \
python3dist-genson"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
