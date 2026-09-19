SUMMARY = "Python parser combinators"
DESCRIPTION = "Easy-to-use parser combinators, for parsing in pure Python."
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "python313-parsy-2.2-1.4.noarch.rpm"
RPM_HASH = "556c232b0fae105034205285ab66ca964ade32f56c89e9bed4f5cbee75b6c68469f0a9074d28eb4bae5dc8cf0452003bd0c797913b0692f571b851c7beb90058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsy \
python3.13dist-parsy \
python313-parsy \
python3dist-parsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
