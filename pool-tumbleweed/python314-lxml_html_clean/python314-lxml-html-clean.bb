SUMMARY = "HTML cleaner from lxml project"
DESCRIPTION = "Separate project for HTML cleaning functionalities copied from lxml.html.clean."
LICENSE = "BSD-3-Clause"

PV = "0.4.5"

RPM_NAME = "python314-lxml_html_clean-0.4.5-1.1.noarch.rpm"
RPM_HASH = "798d0ad3404e257d03d916663d7e34e4f4da5ed45692a2eee06975ecc12f9ac742a82cfd5aec9d0255e4944afab11933738250f5441f1796ed6431314f53c489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lxml-html-clean \
python314-lxml-html-clean \
python3dist-lxml-html-clean"

RDEPENDS:${PN} += "python-abi \
python314-lxml"

inherit rpm
