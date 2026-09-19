SUMMARY = "The pip wheel for custom tests and install requirements"
DESCRIPTION = "This packages provides the pip wheel as separate file for cases where \
the wheel needs to be used directly in test or install setups"
LICENSE = "MIT"

PV = "26.2.1"

RPM_NAME = "python312-pip-wheel-26.2.1-1.1.noarch.rpm"
RPM_HASH = "7c43ff7c38b0b1c860e5e301e2c74fa22d1c3ffe9aa0f6ba751eba8afd623896a8ea2960c44e52f9275243473884aaa162a56a00327e20087de0cfab475ef096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python312-pip-wheel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
