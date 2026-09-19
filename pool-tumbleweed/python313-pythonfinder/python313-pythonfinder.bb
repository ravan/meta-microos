SUMMARY = "A tool to locate Python on the system"
DESCRIPTION = "A Python discovery tool to locate Python on the system."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python313-pythonfinder-1.3.1-4.5.noarch.rpm"
RPM_HASH = "4870770f25100f4f74b52932532da462c7cd492b9588eba9af7d7b22f652bd1ed1e8c03724f53d41f38b0474089c7af7f4ce899a9f6e13b695b8f4f016d11b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythonfinder \
python3.13dist-pythonfinder \
python313-pythonfinder \
python3dist-pythonfinder"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-attrs \
python313-cached-property \
python313-click \
python313-packaging \
python313-vistir \
update-alternatives"

inherit rpm
