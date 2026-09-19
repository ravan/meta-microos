SUMMARY = "AR file handling"
DESCRIPTION = "AR file handling"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python313-unix-ar-0.2.1-1.5.noarch.rpm"
RPM_HASH = "92343fdc90e093e2576501ee9bb43f14e267104a0c0a38c9afe8093b14a9f4d3e3a2e8415ca372fb045936038dbb9d3a5394bc34a5da70950459b0996e1436a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unix-ar \
python3.13dist-unix-ar \
python313-unix-ar \
python3dist-unix-ar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
