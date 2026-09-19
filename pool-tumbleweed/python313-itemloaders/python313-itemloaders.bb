SUMMARY = "Base library for scrapy's ItemLoader"
DESCRIPTION = "Library to populate items using XPath and CSS with a convenient API"
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python313-itemloaders-1.4.0-1.4.noarch.rpm"
RPM_HASH = "50adac93d1efa934bbd5d4b4dd7a17edd7c9757a97efe5cc79b3257fb4bef67fa3b60c671ac650f3f5fa812c291b7341989d4d17104f5fb99663ad7479602e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-itemloaders \
python3.13dist-itemloaders \
python313-itemloaders \
python3dist-itemloaders"

RDEPENDS:${PN} += "python-abi \
python313-itemadapter \
python313-jmespath \
python313-parsel"

inherit rpm
