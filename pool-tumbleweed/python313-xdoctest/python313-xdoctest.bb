SUMMARY = "Enhanced Python builtin doctest module"
DESCRIPTION = "A rewrite of the builtin doctest module with a pytest plugin."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "python313-xdoctest-1.3.2-1.3.noarch.rpm"
RPM_HASH = "b37dede1c43046774612df60894b9beb6f5ad52e2a64e420b5ed4721c1f2f7796eb6be42026572c12a2c4e05e8edded447bc813dec4975c0c52255ad056da707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xdoctest \
python3.13dist-xdoctest \
python313-xdoctest \
python3dist-xdoctest"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
