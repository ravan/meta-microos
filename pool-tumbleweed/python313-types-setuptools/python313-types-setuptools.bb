SUMMARY = "Typing stubs for setuptools"
DESCRIPTION = "Typing stubs for setuptools"
LICENSE = "Apache-2.0"

PV = "70.1.0.20240627"

RPM_NAME = "python313-types-setuptools-70.1.0.20240627-1.9.noarch.rpm"
RPM_HASH = "633a879ee86cfba6e0eb7eacb84fb36866f69066efac403f6d5a3a21061072cf6815ede73251cd1eedd6827f256e053f6e8616da738a93d15ccfd8a57ee16397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-types-setuptools \
python3.13dist-types-setuptools \
python313-types-setuptools \
python3dist-types-setuptools"

RDEPENDS:${PN} += ""

inherit rpm
