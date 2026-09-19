SUMMARY = "Read, write and generate UFOs with designspace data"
DESCRIPTION = "Read, write and generate UFOs with designspace data."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python314-ufoProcessor-1.14.1-1.2.noarch.rpm"
RPM_HASH = "a54087f67f319a769a60fe0d4336909d8d3042dcc2763164330779112ceea4cc55e89f0532cad03a38fdfd59de9f9172a4fd4e72c6828db41abaf482d2886ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ufoprocessor \
python314-ufoProcessor \
python3dist-ufoprocessor"

RDEPENDS:${PN} += "python-abi \
python314-FontTools \
python314-defcon \
python314-fontMath \
python314-fontParts \
python314-lxml \
python314-mutatorMath"

inherit rpm
