SUMMARY = "Python XML Binding"
DESCRIPTION = "Python XML Binding"
LICENSE = "MIT"

PV = "26.2"

RPM_NAME = "python314-xsdata-26.2-1.3.noarch.rpm"
RPM_HASH = "4ca2586725826a07a579ec6c2cd5a36de606b059f569f24313d752d84577475b3c9c5c50d38da9f4d63f481639ab75a913bfc3b3e78ee1ce2658ca02bf0082ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xsdata \
python314-xsdata \
python3dist-xsdata"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-typing-extensions \
update-alternatives"

inherit rpm
