SUMMARY = "ReactiveX (Rx) for Python"
DESCRIPTION = "A library for composing asynchronous and event-based programs using observable \
collections and query operator functions in Python"
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python313-reactivex-5.1.0-1.1.noarch.rpm"
RPM_HASH = "9839fa5e62eb6f40bebc167f621f8570d7883dd82fdb3073fcd399ff6820b33c1c6a1cd17758626a4e5d5e52d19ea0b1487d76ea1abfa2f93076e6173bf297c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reactivex \
python3.13dist-reactivex \
python313-reactivex \
python3dist-reactivex"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
