SUMMARY = "Structured deserialization of Docker Compose files"
DESCRIPTION = "Structured deserialization of Docker Compose files."
LICENSE = "MIT"

PV = "0.0.34"

RPM_NAME = "python313-pycomposefile-0.0.34-1.4.noarch.rpm"
RPM_HASH = "92ea09353f97896c4a2b6bdad3024a597e9a528ebdfdd42a610fd4ba619ea4ef19d49f1ac0e94a6ee76a8399ea2624b83d9c4e3ba7d1ffe837de43db509bf23c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycomposefile \
python3.13dist-pycomposefile \
python313-pycomposefile \
python3dist-pycomposefile"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML"

inherit rpm
