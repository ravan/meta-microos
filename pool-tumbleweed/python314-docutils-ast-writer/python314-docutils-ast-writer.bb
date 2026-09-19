SUMMARY = "AST Writer for docutils"
DESCRIPTION = "Docutils-ast-writer is an AST writer of Docutils."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-docutils-ast-writer-0.1.2-4.10.noarch.rpm"
RPM_HASH = "e592745d014ac1c2083fea714e95d78058bc6817d1317171c98f22167adaf16e334a3c54aefdba8651e102ced6bf2be84511ac6698e761d96cfacaf76a4d350e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docutils-ast-writer \
python314-docutils-ast-writer \
python3dist-docutils-ast-writer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-docutils \
update-alternatives"

inherit rpm
