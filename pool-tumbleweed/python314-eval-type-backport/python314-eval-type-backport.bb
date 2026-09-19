SUMMARY = "`typing._eval_type` for older Python versions"
DESCRIPTION = "Like `typing._eval_type`, but lets older Python versions use newer typing features."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-eval-type-backport-0.4.0-2.1.noarch.rpm"
RPM_HASH = "c13cd5b0042af33f74ab85e7913321faa8af329a68c2394e9ad1ab8a0e41131d7a4db40dfadc8e9dd6cc31f4b6fe2a6537e2f1a4ebcd43fec6ccdef0ed6aec53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-eval-type-backport \
python314-eval-type-backport \
python3dist-eval-type-backport"

RDEPENDS:${PN} += "python-abi"

inherit rpm
