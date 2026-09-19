SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python314-dfdatetime-0~20230225-3.5.noarch.rpm"
RPM_HASH = "aa4d69d539210df8ede9d3642614d817da0bfabb68ca8f39fc5201c4b871aaaa72a944b5b521b7834440e5f522610dd56b6dcfa301173a680032d0ff5ac0d59e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dfdatetime \
python314-dfdatetime \
python3dist-dfdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
