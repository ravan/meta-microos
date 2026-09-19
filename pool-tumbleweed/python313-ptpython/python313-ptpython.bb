SUMMARY = "Python REPL build on top of prompt_toolkit"
DESCRIPTION = "Ptpython is an advanced Python REPL, built using prompt_toolkit."
LICENSE = "ISC"

PV = "3.0.32"

RPM_NAME = "python313-ptpython-3.0.32-2.2.noarch.rpm"
RPM_HASH = "bef16ec895cf0b6cf7049a7ad8c01da99c6c6b1a0dc3adc76fcb8bd0a289b138c8c16a6ff72ff6a45555dfeaecc867363b9a6fbb3e5779036746e2ad2f2802db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptpython \
python3.13dist-ptpython \
python313-ptpython \
python3dist-ptpython"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pygments \
python313-appdirs \
python313-jedi \
python313-prompt-toolkit \
update-alternatives"

inherit rpm
