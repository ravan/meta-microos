SUMMARY = "JavaScript to Python Translator & JavaScript interpreter"
DESCRIPTION = "Translates JavaScript to Python code. Js2Py is able to translate and \
execute virtually any JavaScript code. Js2Py, basically an \
implementation of the JavaScript core, is written in pure Python."
LICENSE = "MIT"

PV = "0.74"

RPM_NAME = "python313-Js2Py-0.74-6.1.noarch.rpm"
RPM_HASH = "d81459c6d40786e07d0adb77440ee904837a5719524bab478273b786543e08b84e6e7aec3521a72eec1ced2610586dc2b2c65b97df7f236da1cbaea916a6541e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Js2Py \
python3.13dist-js2py \
python313-Js2Py \
python3dist-js2py"

RDEPENDS:${PN} += "python-abi \
python313-pyjsparser \
python313-tzlocal"

inherit rpm
