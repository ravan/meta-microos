SUMMARY = "CLI, cURL-like tool for humans"
DESCRIPTION = "HTTPie consists of a single 'http' command designed for debugging and \
interaction with HTTP servers, RESTful APIs, and web services. \
 \
It allows for issuing arbitrary HTTP requests and displays colorized \
responses."
LICENSE = "BSD-3-Clause"

PV = "3.2.4"

RPM_NAME = "httpie-3.2.4-5.4.noarch.rpm"
RPM_HASH = "dae128bb18129691410fed9efe9ffa181cccfd898fd84ddd99a19733e048533bc3ae7b94938e37174265b0afbe9f49e4b319b90802a072bca6e5202cd874b0e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpie \
python3-httpie \
python3.13dist-httpie \
python313-httpie \
python3dist-httpie"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313 \
python313-Pygments \
python313-charset-normalizer \
python313-defusedxml \
python313-multidict \
python313-pip \
python313-requests \
python313-requests-toolbelt \
python313-rich \
python313-setuptools \
update-alternatives"

inherit rpm
