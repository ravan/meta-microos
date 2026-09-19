SUMMARY = "PEG Parser-Interpreter framework for Python"
DESCRIPTION = "pyPEG is a plain and simple intrinsic parser interpreter framework \
for Python. It is based on Parsing Expression Grammar, PEG. \
With pyPEG you can parse many formal languages in a very easy way."
LICENSE = "GPL-2.0-only"

PV = "2.15.2"

RPM_NAME = "python314-pyPEG2-2.15.2-4.8.noarch.rpm"
RPM_HASH = "b4bbb1454189e79430884a96eda63adb766c2b660f2968d130e701225fcf77c9a4eab0d7b3a53a08317097da28cad83af6a8b6bfaa27604486c3769288772655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypeg2 \
python314-pyPEG2 \
python3dist-pypeg2"

RDEPENDS:${PN} += "python-abi \
python314-lxml"

inherit rpm
