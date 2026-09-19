SUMMARY = "Unified diff parsing/metadata extraction library"
DESCRIPTION = "Python library to parse and interact with unified diff data."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python314-unidiff-0.7.5-1.12.noarch.rpm"
RPM_HASH = "d2219bb51c56a7cc85d7286ea270c570034466c8873f0a443506231d490617e838146659ae3924a43553343b832396ba721f49a9174a0ecdbb1879adb2b25143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unidiff \
python314-unidiff \
python3dist-unidiff"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
