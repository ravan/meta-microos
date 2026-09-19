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

RPM_NAME = "python314-mypy-2.3.1-2.1.noarch.rpm"
RPM_HASH = "f92bb5cad8ba01bd5e746dbd587add15f4496ba3bc57cd8da33220434bbc2e8d15521116676bc1037403ba08c83af42b2d8c2fd593374b7ac88a14b94bd7c356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mypy \
python314-mypy \
python3dist-mypy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314 \
python314-ast-serialize \
python314-librt \
python314-mypy-extensions \
python314-pathspec \
python314-typing-extensions"

inherit rpm
