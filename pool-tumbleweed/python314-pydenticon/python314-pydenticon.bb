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

RPM_NAME = "python314-pydenticon-0.3.1-7.5.noarch.rpm"
RPM_HASH = "3740e36d28cf9810308f29b2bbb40b9f6a0c404a09d289d8fea4316df009c60506b94ed7390af278454948d332d773532ea28ad2182d74a6f20856653148f59c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydenticon \
python314-pydenticon \
python3dist-pydenticon"

RDEPENDS:${PN} += "python-abi \
python314-Pillow"

inherit rpm
