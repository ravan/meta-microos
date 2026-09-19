SUMMARY = "CPython's PEG parser generator"
DESCRIPTION = "CPython's PEG parser generator"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-pegen-0.3.0-4.2.noarch.rpm"
RPM_HASH = "bef5ee73e5313e67ebebcecfc92de82bc478f2e8ef85ff112831f640c88753b194886748de9e0f79e4896cf593e80af2e9fb33d2251bdda4b41591c6b8bcf2f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pegen \
python314-pegen \
python3dist-pegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
