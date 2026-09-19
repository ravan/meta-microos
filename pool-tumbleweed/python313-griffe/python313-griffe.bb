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

RPM_NAME = "python313-griffe-2.0.2-1.3.noarch.rpm"
RPM_HASH = "9dcbe7340a78befad78614e10e7a1782de2d5ce6e2f211c95deba1a03c0bc52bbc501f699fb7ca6f13de232786bf19e052d6a56a4d1095e59f5c3baac7dcfcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-griffe \
python3.13dist-griffe \
python313-griffe \
python3dist-griffe"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python313-griffe-inherited-docstrings \
python313-griffecli \
python313-griffelib \
python313-jsonschema"

inherit rpm
