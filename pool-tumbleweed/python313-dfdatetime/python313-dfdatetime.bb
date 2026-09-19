SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python313-dfdatetime-0~20230225-3.5.noarch.rpm"
RPM_HASH = "8cb1295b378646f4e5cc86cb1455decc69c0c51e19db5f0acbfc785b235a645f4a6583cfc7f378bf388b6e6ccc97afc30c27660e67807477efb02e775f7a027c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfdatetime \
python3.13dist-dfdatetime \
python313-dfdatetime \
python3dist-dfdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
