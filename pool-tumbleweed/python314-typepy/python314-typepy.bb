SUMMARY = "Python library for run time variable type checker"
DESCRIPTION = "typepy is a Python library for variable type checker/validator/converter at run time."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-typepy-2.0.0-1.2.noarch.rpm"
RPM_HASH = "b18298b7a82e69470d51bfa6a91bf94248f6909f734c61a3b7c871bf3d1f6a5adfbbc0b2b4b6e6417ea4dea86bbbe5e3b4db4b79e62d75b963983dc42b82ed09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-typepy \
python314-typepy \
python3dist-typepy"

RDEPENDS:${PN} += "python-abi \
python314-mbstrdecoder \
python314-tzdata"

inherit rpm
