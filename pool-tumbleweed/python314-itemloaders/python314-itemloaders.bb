SUMMARY = "Base library for scrapy's ItemLoader"
DESCRIPTION = "Library to populate items using XPath and CSS with a convenient API"
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python314-itemloaders-1.4.0-1.4.noarch.rpm"
RPM_HASH = "4e3079d8bafee5a2909d21f28aa9ac7882ed22e2659294fd60f2b0b09d143f2bba0603deb3c2ffdadeb94458565bc0a16efe02a23b1670fd34ab99226bacc799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-itemloaders \
python314-itemloaders \
python3dist-itemloaders"

RDEPENDS:${PN} += "python-abi \
python314-itemadapter \
python314-jmespath \
python314-parsel"

inherit rpm
