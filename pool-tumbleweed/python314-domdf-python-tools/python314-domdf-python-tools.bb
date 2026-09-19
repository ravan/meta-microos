SUMMARY = "Helpful functions for Python 🐍 🛠️"
DESCRIPTION = "Helpful functions for Python 🐍 🛠️"
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "python314-domdf-python-tools-3.10.0-2.5.noarch.rpm"
RPM_HASH = "b94de11ccb4b67094e87ffd1fc8ed44c5978d880437e1904c9bfd1ced00177df6da4ed5cece9dd3cf3851bbc53faf01e88177fccef36086cf7bfefbf710af1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-domdf-python-tools \
python314-domdf-python-tools \
python3dist-domdf-python-tools"

RDEPENDS:${PN} += "python-abi \
python314-natsort \
python314-typing-extensions"

inherit rpm
