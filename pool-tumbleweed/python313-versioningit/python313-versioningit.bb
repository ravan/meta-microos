SUMMARY = "Versioning It with your Version In Git"
DESCRIPTION = "Python Setuptools plugin for automatically determining your package's version \
based on your version control repository's tags. Unlike others, it allows easy \
customization of the version format and even lets you easily override the \
separate functions used for version extraction & calculation."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python313-versioningit-3.3.0-1.5.noarch.rpm"
RPM_HASH = "31ec844c6dabea909f3fd90e73556b03ce659795208f08e8fbfbfd2da5a028431cc2d1bf5faf96ba948133a70b298ad794e2cf4188ba9322580d8ef53c400491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioningit \
python3.13dist-versioningit \
python313-versioningit \
python3dist-versioningit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging \
python313-tomli"

inherit rpm
