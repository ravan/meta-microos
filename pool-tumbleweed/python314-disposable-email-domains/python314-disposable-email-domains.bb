SUMMARY = "A set of disposable email domains"
DESCRIPTION = "A set of disposable email domains"
LICENSE = "MIT"

PV = "0.0.241"

RPM_NAME = "python314-disposable-email-domains-0.0.241-1.1.noarch.rpm"
RPM_HASH = "d93ebce13a33d1443d49206434247004d9e51bd50b2ffdd04453d11998184daf5fee6e2f6690b184f74e50f4e33b9d30bdd66ee1ff9c286b7d1bdedddf02c9fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-disposable-email-domains \
python314-disposable-email-domains \
python3dist-disposable-email-domains"

RDEPENDS:${PN} += "python-abi"

inherit rpm
