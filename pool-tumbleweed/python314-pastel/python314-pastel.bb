SUMMARY = "String colorization for Python"
DESCRIPTION = "Pastel is a library to colorize strings in the terminal."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-pastel-0.2.1-3.5.noarch.rpm"
RPM_HASH = "79e4c2e6e917ac0dd88456fbe037e4a7352870c2e3968c16199cbbc6211284a24d1a249afd6992b9d2b0d9e43f1c24f52c12541f1914b4e6427fca78e01878de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pastel \
python314-pastel \
python3dist-pastel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
