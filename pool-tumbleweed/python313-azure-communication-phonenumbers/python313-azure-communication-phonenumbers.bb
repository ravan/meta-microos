SUMMARY = "Microsoft Azure Communication Phone Numbers Client Library for Python"
DESCRIPTION = "Azure Communication Phone Numbers Package client library for Python \
 \
Azure Communication Phone Numbers client package is used to administer Phone Numbers."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python313-azure-communication-phonenumbers-1.4.0-1.5.noarch.rpm"
RPM_HASH = "4fefbb0b0ecd30be6ccf6678fd7150b831f81156b63ff315d6e2e4b81f45d230362b34cfdb21d273565f1b93a3fb2b1d1fa8274ffd6ad1e494e2aaf2a4acc54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-phonenumbers \
python3.13dist-azure-communication-phonenumbers \
python313-azure-communication-phonenumbers \
python3dist-azure-communication-phonenumbers"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg \
python313-isodate \
python313-typing-extensions"

inherit rpm
