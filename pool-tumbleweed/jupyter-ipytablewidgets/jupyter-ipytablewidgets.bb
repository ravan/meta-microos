SUMMARY = "Jupyter Notebook extension for python-ipytablewidgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
This package provides the jupyter notebook extension"
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "jupyter-ipytablewidgets-0.3.4-1.1.noarch.rpm"
RPM_HASH = "8fbb1f76e76678a79f388c514565988f55943a07df94eb1590036dcfeeae69506e383c210566326bd0a400589d21faf416e1c63a4f3fea5b0c0dd08c52b6f8e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipytablewidgets"

RDEPENDS:${PN} += "python3dist-ipytablewidgets"

inherit rpm
