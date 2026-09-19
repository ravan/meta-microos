SUMMARY = "Retrying library for Python"
DESCRIPTION = "Retrying is a general-purpose retrying library, written in Python, to \
simplify the task of adding retry behavior to just about anything."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python314-retrying-1.4.2-1.3.noarch.rpm"
RPM_HASH = "4c878944a5fec3dcbd42fcfec15238a0866704110e9c7d0c067adc3247a30dde27c3df8e753e3848248b6ee04609c8830bc0c837487ba15ceeda5f2f7a58aff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-retrying \
python314-retrying \
python3dist-retrying"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
