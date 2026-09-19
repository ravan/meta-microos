SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python314-pydyf-0.12.1-1.4.noarch.rpm"
RPM_HASH = "8d5e90af5376e5fed4527b0cf9b1e7ded27daf79278e39a5cf71246576cc4f8ffe0b06198fd8767a72cb48ccdba41e08d63c80e0b627b85373ebf10ede9fa1bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydyf \
python314-pydyf \
python3dist-pydyf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
