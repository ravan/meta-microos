SUMMARY = "Microsoft Azure Datadog Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Datadog Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-mgmt-datadog-2.1.0-2.9.noarch.rpm"
RPM_HASH = "a34f8b4b794f7c3e6fc9018e4f337e4f1250075d9998aa9acfb0c31caa96eee22a54dfbfb6bd7d49d9bbf2232cd43e0ef8f94855aeb47439aad65ab1c443cda7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datadog \
python3.13dist-azure-mgmt-datadog \
python313-azure-mgmt-datadog \
python3dist-azure-mgmt-datadog"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
