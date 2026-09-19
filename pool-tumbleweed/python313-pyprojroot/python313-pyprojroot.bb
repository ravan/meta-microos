SUMMARY = "Project-oriented workflow in Python"
DESCRIPTION = "Project-oriented workflow in Python"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-pyprojroot-0.3.0-1.4.noarch.rpm"
RPM_HASH = "62345932c48710a86410fa5f9b9027ce9436a412f000aaf6522aa9d51e6c92b809539d364e0df5ab537d4e123f1796a52242b0a4ce44ef2a5dec126c5438a1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyprojroot \
python3.13dist-pyprojroot \
python313-pyprojroot \
python3dist-pyprojroot"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
