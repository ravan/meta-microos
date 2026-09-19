SUMMARY = "Read, write and generate UFOs with designspace data"
DESCRIPTION = "Read, write and generate UFOs with designspace data."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python313-ufoProcessor-1.14.1-1.2.noarch.rpm"
RPM_HASH = "422ba1886aabfb01c462a69f7665ca60c3a499b486321ebeb942889004845c7c80cf3567f6b9c245b10b32060fae66172c815e80dc1d510ed643261c9b859001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ufoProcessor \
python3.13dist-ufoprocessor \
python313-ufoProcessor \
python3dist-ufoprocessor"

RDEPENDS:${PN} += "python-abi \
python313-FontTools \
python313-defcon \
python313-fontMath \
python313-fontParts \
python313-lxml \
python313-mutatorMath"

inherit rpm
