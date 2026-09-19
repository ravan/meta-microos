SUMMARY = "Generate source code for Python classes from a JSON schema"
DESCRIPTION = "Generate source code for Python classes from a JSON schema."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python314-jschema-to-python-1.2.3-3.5.noarch.rpm"
RPM_HASH = "7f61d106c63263979015b1691a1f6971e890f97c06df5ce63dc989d7d139cb4b38db770da7cfe11148246bfbf0edaa8f593458255cef699b0b39f6f24bab5693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jschema-to-python \
python314-jschema-to-python \
python3dist-jschema-to-python"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-jsonpickle \
python314-pbr"

inherit rpm
