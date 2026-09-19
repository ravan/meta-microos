SUMMARY = "A small Python module to parse various kinds of time expressions"
DESCRIPTION = "A small Python module to parse various kinds of time expressions. Developed separately from the original."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python314-pytimeparse2-1.7.1-2.5.noarch.rpm"
RPM_HASH = "98b9783dc9f2d117ac27fb6408227a54bedaa9a0f6e75726a36945819b0924e759d4b4c33720440515094c3786f3f90bdce208869177695c016240c899160659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytimeparse2 \
python314-pytimeparse2 \
python3dist-pytimeparse2"

RDEPENDS:${PN} += "python-abi \
python3-base"

inherit rpm
