SUMMARY = "Python REPL build on top of prompt_toolkit - IPython support"
DESCRIPTION = "Ptpython is an advanced Python REPL. \
 \
This package provides IPython support to Ptpython."
LICENSE = "ISC"

PV = "3.0.32"

RPM_NAME = "python314-ptpython-ptipython-3.0.32-2.2.noarch.rpm"
RPM_HASH = "4d9e5ae8c44706cd4f091b8aa37f67857c291ed94f235291b9f6a05fb0d06bab0111c040dbd7ac4d7c5f31e74e87cc97040e1f4ca0f71f7f6d99556e70681874"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-ptpython-ptipython"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python314-ipython \
python314-ptpython"

inherit rpm
