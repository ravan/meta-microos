SUMMARY = "PEM file parsing in Python"
DESCRIPTION = "pem is a Python module for parsing and splitting of PEM files, \
i.e. Base64 encoded DER keys and certificates."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python314-pem-23.1.0-1.12.noarch.rpm"
RPM_HASH = "4ee4ff5e22067a071264956dd9519069594333c8328b900b40b8b4ef1ac31be08ab63416bfab442c62decd06f85a00021d01edad0a1f7e12f5b277ba1e2e9862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pem \
python314-pem \
python3dist-pem"

RDEPENDS:${PN} += "python-abi"

inherit rpm
