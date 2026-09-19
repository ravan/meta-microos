SUMMARY = "Python dictionaries with attribute access"
DESCRIPTION = "tri.struct supplies classes that can be used like dictionaries and as \
objects with attribute access at the same time."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python313-tri.struct-4.1.0-2.6.aarch64.rpm"
RPM_HASH = "02917c166d712261146d2fd80f69168c7719b6c6abdc57e7a0f0376698458014d86761a0976352b088accefd680776eb3d9e83352aaffacc1ed05c5645caa429"

RPROVIDES:${PN} += "python3-tri.struct \
python3.13dist-tri.struct \
python313-tri.struct \
python3dist-tri.struct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
