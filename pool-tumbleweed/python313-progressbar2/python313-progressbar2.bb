SUMMARY = "Python library to provide visual text-based progress to long running operations"
DESCRIPTION = "A Python Progressbar library to provide visual (yet text based) progress to long running operations."
LICENSE = "BSD-3-Clause"

PV = "4.5.0"

RPM_NAME = "python313-progressbar2-4.5.0-1.2.noarch.rpm"
RPM_HASH = "e9f8243b6f2f3b5321cd89168f52652d0ffd74de0af7eca8aad808b3da4374394e1faed3920d02973335a820dba2bd7645a6068345896fd1475ab8c8c63ed606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progressbar2 \
python3.13dist-progressbar2 \
python313-progressbar2 \
python3dist-progressbar2"

RDEPENDS:${PN} += "python-abi \
python313-python-utils"

inherit rpm
