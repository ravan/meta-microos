SUMMARY = "Tianocore Edk2 PyTool Extensions"
DESCRIPTION = "Extensions to the edk2 build system allowing for a more robust and plugin based build system and tool execution environment"
LICENSE = "BSD-2-Clause-Patent"

PV = "0.31.1"

RPM_NAME = "python313-edk2toolext-0.31.1-1.1.noarch.rpm"
RPM_HASH = "7e6c9c1b3ecb49f246fd17417b7bd5edd2448f625d80f64537b6c273191f647887fdca554d5962af10a890f230ef71adbcde07072018ba10aaab6f5d0bdf5d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-edk2toolext \
python3.13dist-edk2-pytool-extensions \
python313-edk2toolext \
python3dist-edk2-pytool-extensions"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-GitPython \
python313-PyYAML \
python313-XlsxWriter \
python313-edk2toollib \
python313-openpyxl \
python313-pefile \
python313-semantic-version \
python313-setuptools \
update-alternatives"

inherit rpm
