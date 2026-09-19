SUMMARY = "Python unittest Utilities"
DESCRIPTION = "Python unittest Utilities."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python313-case-1.5.3-9.5.noarch.rpm"
RPM_HASH = "5029823550bb2649912a405abfbccbf11ab3c186fef185d1c2e38394b617e55ae0e8da7a6185d021687eab2f188eadfda94a910539eade0d362dac80ce2b6d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-case \
python3.13dist-case \
python313-case \
python3dist-case"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-setuptools \
python313-six"

inherit rpm
