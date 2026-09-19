SUMMARY = "Python REPL build on top of prompt_toolkit - IPython support"
DESCRIPTION = "Ptpython is an advanced Python REPL. \
 \
This package provides IPython support to Ptpython."
LICENSE = "ISC"

PV = "3.0.32"

RPM_NAME = "python313-ptpython-ptipython-3.0.32-2.2.noarch.rpm"
RPM_HASH = "504ae4fb309e6d49d83af724a7001df6431785dbdc4af3277d8ef85ebf178248cd54f9ed6bfb91e42e7e0312ba19df40cf595a935cdc5715a65f91224aef6359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptpython-ptipython \
python313-ptpython-ptipython"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python313-ipython \
python313-ptpython"

inherit rpm
