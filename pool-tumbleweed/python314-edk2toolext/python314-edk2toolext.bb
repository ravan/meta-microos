SUMMARY = "Tianocore Edk2 PyTool Extensions"
DESCRIPTION = "Extensions to the edk2 build system allowing for a more robust and plugin based build system and tool execution environment"
LICENSE = "BSD-2-Clause-Patent"

PV = "0.31.1"

RPM_NAME = "python314-edk2toolext-0.31.1-1.1.noarch.rpm"
RPM_HASH = "4ce1aa8eb947a23f719123e36c70c0652e3af2ddb88ff3feb27fd7d6a49f53c5ca58278ee3cf58418bebe22a070e7de5b1cfc64e1bda91b87da726794b81f309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-edk2-pytool-extensions \
python314-edk2toolext \
python3dist-edk2-pytool-extensions"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-GitPython \
python314-PyYAML \
python314-XlsxWriter \
python314-edk2toollib \
python314-openpyxl \
python314-pefile \
python314-semantic-version \
python314-setuptools \
update-alternatives"

inherit rpm
