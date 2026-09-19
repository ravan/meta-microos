SUMMARY = "Python container testing library"
DESCRIPTION = "Python container testing library."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-conu-1.0.0-4.2.noarch.rpm"
RPM_HASH = "3ecda7ec341c52fdf3101064e6a1f5679bc771ad5266ecdf49a2ccdc2944a181b41a7529503b51611b0bd1234d4e8a21b4d1634ba2148fdb9d89dc274897907f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-conu \
python314-conu \
python3dist-conu"

RDEPENDS:${PN} += "python-abi \
python314-docker \
python314-flexmock \
python314-kubernetes \
python314-multiprocess \
python314-pytest \
python314-requests"

inherit rpm
