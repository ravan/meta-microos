SUMMARY = "HTML cleaner from lxml project"
DESCRIPTION = "Separate project for HTML cleaning functionalities copied from lxml.html.clean."
LICENSE = "BSD-3-Clause"

PV = "0.4.5"

RPM_NAME = "python313-lxml_html_clean-0.4.5-1.1.noarch.rpm"
RPM_HASH = "15684aa13af226d347cb55870dd8421b4728f364896d531c040861f50f9018d0f56103816e521433ee72ab9241bee30ba4cff1083a22e0a08cc3149f22ef0bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lxml-html-clean \
python3.13dist-lxml-html-clean \
python313-lxml-html-clean \
python3dist-lxml-html-clean"

RDEPENDS:${PN} += "python-abi \
python313-lxml"

inherit rpm
