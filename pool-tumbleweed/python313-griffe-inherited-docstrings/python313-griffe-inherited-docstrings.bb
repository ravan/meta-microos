SUMMARY = "Griffe extension for inheriting docstrings"
DESCRIPTION = "Griffe extension for inheriting docstrings. \
 \
The extension will iterate on every class and their members \
to set docstrings from parent classes when they are not already defined."
LICENSE = "ISC"

PV = "1.1.3"

RPM_NAME = "python313-griffe-inherited-docstrings-1.1.3-1.2.noarch.rpm"
RPM_HASH = "7133781f7f52e683f0c07676b66d0bc1d3b5e421b0df1e2591a625a52cbeecc076374f218f38dea1c448e1374da66b8de3b65b3fbeb7b86883871b087bc49f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-griffe-inherited-docstrings \
python3.13dist-griffe-inherited-docstrings \
python313-griffe-inherited-docstrings \
python3dist-griffe-inherited-docstrings"

RDEPENDS:${PN} += "python-abi \
python313-griffelib"

inherit rpm
