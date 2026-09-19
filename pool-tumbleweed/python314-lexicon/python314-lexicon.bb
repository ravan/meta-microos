SUMMARY = "Python dict subclass(es) with aliasing and attribute access"
DESCRIPTION = "Lexicon is a collection of dict subclasses: \
 \
* AliasDict, a dictionary supporting both simple and complex key aliasing \
* AttributeDict, supporting attribute read and write access \
* Lexicon, a subclass of both of the above which exhibits both sets of behavior"
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python314-lexicon-3.0.0-1.4.noarch.rpm"
RPM_HASH = "6dfa3f97d0852117db1df78e380a6f08d43315ebefeb4d3d6a0008e49c91355010e65c20c6e4e21b3a2e3d9dd54c26ce3561df2f970f115a3e4fdf00d00b93c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lexicon \
python314-lexicon \
python3dist-lexicon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
