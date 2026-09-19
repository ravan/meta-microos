SUMMARY = "Optional static typing for Python"
DESCRIPTION = "Mypy is an optional static type checker for Python that aims to \
combine the benefits of both dynamic (or 'duck') typing as well as \
static typing. \
 \
Mypy type checks standard Python programs. It can catch many \
programming errors by analyzing programs without having to run them. \
There is basically no runtime overhead when run using any Python VM. \
Mypy's type system features type inference, gradual typing, generics \
and union types."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python313-mypy-2.3.1-2.1.noarch.rpm"
RPM_HASH = "109df9f562685d007fa930674fec059be490a6172ca6647e8a8a11daf5d884f4c5ed66380f6ac0d7e5f124c97dc41170582f4e3edcb457b4821723b2c4f4de45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypy \
python3-mypy \
python3.13dist-mypy \
python313-mypy \
python3dist-mypy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313 \
python313-ast-serialize \
python313-librt \
python313-mypy-extensions \
python313-pathspec \
python313-typing-extensions"

inherit rpm
