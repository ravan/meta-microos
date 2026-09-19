SUMMARY = "Signatures for entire Python programs"
DESCRIPTION = "Signatures for entire Python programs. Extract the structure, the frame, \
the skeleton of your project, to generate API documentation or find \
breaking changes in your API. \
 \
Griffe, pronounced 'grif' (`/ɡʁif/`), is a french word that means \
'claw', but also 'signature' in a familiar way. 'On reconnaît bien là sa \
griffe.'"
LICENSE = "ISC"

PV = "2.0.2"

RPM_NAME = "python314-griffe-2.0.2-1.3.noarch.rpm"
RPM_HASH = "385e352434aedca6d9c3043f6d1cd194f2f559a0c6af7978d521f6a791b5aac32f6afc1f3db9e0601e20541465e0f7751494eea9d815b23b80fa3eaa91813371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-griffe \
python314-griffe \
python3dist-griffe"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python314-griffe-inherited-docstrings \
python314-griffecli \
python314-griffelib \
python314-jsonschema"

inherit rpm
