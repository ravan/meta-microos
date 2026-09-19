SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python314-pdfrw-0.4-5.5.noarch.rpm"
RPM_HASH = "8ec31eab527bb9425bca0f1cd93019df0b90ce589c1da2547ae831819b3f32abac226b4677b493e9a52bd34478ff0c815b3736a2e9a4e207852826a1ed1f3e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pdfrw \
python314-pdfrw \
python3dist-pdfrw"

RDEPENDS:${PN} += "python-abi"

inherit rpm
