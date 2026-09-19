SUMMARY = "Python container testing library"
DESCRIPTION = "Python container testing library."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-conu-1.0.0-4.2.noarch.rpm"
RPM_HASH = "baaf594e2b2221530f6a9a625851e093f8d6b656ae2912b9d8f82b6745213c83b200891162a0cfdbab615c5fa4079ec7e3b545d76740c42808f4251cc62beb44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-conu \
python3.13dist-conu \
python313-conu \
python3dist-conu"

RDEPENDS:${PN} += "python-abi \
python313-docker \
python313-flexmock \
python313-kubernetes \
python313-multiprocess \
python313-pytest \
python313-requests"

inherit rpm
