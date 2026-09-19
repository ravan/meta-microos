SUMMARY = "`typing._eval_type` for older Python versions"
DESCRIPTION = "Like `typing._eval_type`, but lets older Python versions use newer typing features."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-eval-type-backport-0.4.0-2.1.noarch.rpm"
RPM_HASH = "2e312db10d153c41e6dc00130d446ba68c1a1a197f330955ec9790642fbe67a85bf768e1c6978de3ef7e992e13d230352651c9d49b773173c257eef75c82562f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eval-type-backport \
python3.13dist-eval-type-backport \
python313-eval-type-backport \
python3dist-eval-type-backport"

RDEPENDS:${PN} += "python-abi"

inherit rpm
