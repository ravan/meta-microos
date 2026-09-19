SUMMARY = "Retry Decorator"
DESCRIPTION = "Decorator to support retry when an exception occurs."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python314-retry_decorator-1.1.1-2.5.noarch.rpm"
RPM_HASH = "46998e6a6fad3fb1ad14bdd745031f9ab2543cb80f156078a61fdb2daf8a3c97a48fb10b25501bf8edc33036f0000cef37cfd4228f036cd9176babaa63492335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-retry-decorator \
python314-retry-decorator \
python3dist-retry-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
