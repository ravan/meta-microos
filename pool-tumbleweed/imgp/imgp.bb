SUMMARY = "Image resizer and rotator"
DESCRIPTION = "A command line image resizer and rotator for JPEG and PNG images \
based on python-Pillow."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "imgp-3.0-1.1.noarch.rpm"
RPM_HASH = "328e68e406d8941c9801affc4130b6990dc3e41223459b6b07006a1e4e7acd4799727c9f00db5b1cf4cb0fe0a80b9602f1b168c0f7154634c8bd991aa1090a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imgp"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-Pillow \
python3-base"

inherit rpm
