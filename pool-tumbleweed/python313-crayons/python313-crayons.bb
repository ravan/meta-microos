SUMMARY = "Colored strings for terminal usage"
DESCRIPTION = "Crayons is a simple module to give you colored strings for terminal usage. \
Included colors are red, green, yellow, blue, black, magenta, cyan, white, \
and normal."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-crayons-0.4.0-4.5.noarch.rpm"
RPM_HASH = "f25db723a665b407bf6de74f2a0131242b7c938dd3a30cd54c2562af35669db09f7487cba27d395cdeb7a921a30b00ec0f40ccbfc91d77744b349f7b7c85842e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crayons \
python3.13dist-crayons \
python313-crayons \
python3dist-crayons"

RDEPENDS:${PN} += "python-abi \
python313-colorama"

inherit rpm
