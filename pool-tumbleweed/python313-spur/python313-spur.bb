SUMMARY = "Run commands and manipulate files locally or over SSH"
DESCRIPTION = "Run commands and manipulate files locally or over SSH using the same interface"
LICENSE = "BSD-2-Clause"

PV = "0.3.23"

RPM_NAME = "python313-spur-0.3.23-3.5.noarch.rpm"
RPM_HASH = "73d6c59ad0c3d0d3c6a4b980dbe12abe4c98d3268d992781460b5694c9f60c0971233c7029a6d5524511c4ca47432dcbd2bdfdab2016f0b56fe5439ae96ab84b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spur \
python3.13dist-spur \
python313-spur \
python3dist-spur"

RDEPENDS:${PN} += "python-abi \
python313-paramiko"

inherit rpm
