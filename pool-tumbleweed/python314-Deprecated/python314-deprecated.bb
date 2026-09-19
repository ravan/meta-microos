SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python314-Deprecated-1.3.1-1.4.noarch.rpm"
RPM_HASH = "7341b5bccd721d6982d9b4f24166695b07e00466173080cf276274d07632c238047c2514c971d7b6fce9118cdcf474e4130800f58dcfdd4c6de2dfa6c3d0702c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-deprecated \
python314-Deprecated \
python314-deprecated \
python3dist-deprecated"

RDEPENDS:${PN} += "python-abi \
python314-wrapt"

inherit rpm
