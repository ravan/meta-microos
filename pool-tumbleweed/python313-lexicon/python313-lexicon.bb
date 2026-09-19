SUMMARY = "Python dict subclass(es) with aliasing and attribute access"
DESCRIPTION = "Lexicon is a collection of dict subclasses: \
 \
* AliasDict, a dictionary supporting both simple and complex key aliasing \
* AttributeDict, supporting attribute read and write access \
* Lexicon, a subclass of both of the above which exhibits both sets of behavior"
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python313-lexicon-3.0.0-1.4.noarch.rpm"
RPM_HASH = "42aca38740df53ec9b80c5610ba62f6c8a71d7be0397d0d104ff2a8bc3eb19216d90c0c0827bcd398cdea5f195a5b547be3846330851250a77e70a7d596ae54b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lexicon \
python3.13dist-lexicon \
python313-lexicon \
python3dist-lexicon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
