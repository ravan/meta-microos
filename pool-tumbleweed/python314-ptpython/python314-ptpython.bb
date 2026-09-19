SUMMARY = "Python REPL build on top of prompt_toolkit"
DESCRIPTION = "Ptpython is an advanced Python REPL, built using prompt_toolkit."
LICENSE = "ISC"

PV = "3.0.32"

RPM_NAME = "python314-ptpython-3.0.32-2.2.noarch.rpm"
RPM_HASH = "cb2ca7f1d3f9cbdd21aca4694f6858a24550e98819af0a7a2087bcdd9a668457015035459a22623dbd76a630047ba7e0546484cf2b1c8114c10a627441450244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ptpython \
python314-ptpython \
python3dist-ptpython"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pygments \
python314-appdirs \
python314-jedi \
python314-prompt-toolkit \
update-alternatives"

inherit rpm
