SUMMARY = "Option groups missing in Click"
DESCRIPTION = "Option groups missing in Click"
LICENSE = "BSD-3-Clause"

PV = "0.5.9"

RPM_NAME = "python314-click-option-group-0.5.9-1.6.noarch.rpm"
RPM_HASH = "e4d608efe8097c1f90af15a4bffeebed68839d6d156ee4822bf5062739870117b0ced315ceebf6c6d0c9db47efa69b3591a56fc56452fece4987ea893bc947e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-option-group \
python314-click-option-group \
python3dist-click-option-group"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
