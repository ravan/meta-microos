SUMMARY = "Library for generating identicons"
DESCRIPTION = "Pydenticon is a small utility library that can be used for deterministically \
generating identicons based on the hash of provided data. \
 \
The implementation is a port of the Sigil identicon implementation from: \
 \
* https://github.com/cupcake/sigil/ \
 \
Pydenticon provides a couple of extensions of its own when compared to the \
original Sigil implementation, like: \
 \
* Ability to supply custom digest algorithms (allowing for larger identicons if \
  digest provides enough entropy). \
* Ability to specify a rectangle for identicon size.."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "python313-pydenticon-0.3.1-7.5.noarch.rpm"
RPM_HASH = "55430ad6c6b23ef36c7628e693bad5fa692c99d39a2cc2195068dc7e66c07b9a3ce1226a70bdde1b878d5497c4f128a99d8b13d7aaac1c17867bccc7cea5151e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydenticon \
python3.13dist-pydenticon \
python313-pydenticon \
python3dist-pydenticon"

RDEPENDS:${PN} += "python-abi \
python313-Pillow"

inherit rpm
