SUMMARY = "Localization library for expressive translations"
DESCRIPTION = "Localization library for expressive translations."
LICENSE = "Apache-2.0"

PV = "0.19.0"

RPM_NAME = "python313-fluent.syntax-0.19.0-2.5.noarch.rpm"
RPM_HASH = "156f6ed55d37f50ffad60e45eeb5182f7527833aa9681b11de19d9075e177e035610eb39c104afa65ed8cdddda45a20c6fdfaaca7e8e4c347aa28d7811841ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fluent \
python3-fluent.syntax \
python3.13dist-fluent.syntax \
python313-fluent \
python313-fluent.syntax \
python3dist-fluent.syntax"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
