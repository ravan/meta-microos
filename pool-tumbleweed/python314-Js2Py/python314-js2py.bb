SUMMARY = "JavaScript to Python Translator & JavaScript interpreter"
DESCRIPTION = "Translates JavaScript to Python code. Js2Py is able to translate and \
execute virtually any JavaScript code. Js2Py, basically an \
implementation of the JavaScript core, is written in pure Python."
LICENSE = "MIT"

PV = "0.74"

RPM_NAME = "python314-Js2Py-0.74-6.1.noarch.rpm"
RPM_HASH = "06ae5df7acdd7516d750b2f682d7998e9300a61739a27992510db9a44bceb8f6d3cd1777fab7a45c2b2db830e8d4f09be53863ecedac166fed0ee55dbb8f4689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-js2py \
python314-Js2Py \
python3dist-js2py"

RDEPENDS:${PN} += "python-abi \
python314-pyjsparser \
python314-tzlocal"

inherit rpm
