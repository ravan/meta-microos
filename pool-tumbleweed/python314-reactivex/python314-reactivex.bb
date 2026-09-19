SUMMARY = "ReactiveX (Rx) for Python"
DESCRIPTION = "A library for composing asynchronous and event-based programs using observable \
collections and query operator functions in Python"
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python314-reactivex-5.1.0-1.1.noarch.rpm"
RPM_HASH = "102a327637e5de29f1981261a058d5259bf43e3161b1883b4f39d9e68d4358428e7a85b27fba5e21fe81fb72f782709e2898c1273ec6717ea02feb42969e20ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-reactivex \
python314-reactivex \
python3dist-reactivex"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
