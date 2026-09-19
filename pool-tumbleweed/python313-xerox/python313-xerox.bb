SUMMARY = "Simple Copy + Paste in Python"
DESCRIPTION = "Python copy and paste library supporting OS X, X11 (Linux, BSD, etc.), and Windows."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python313-xerox-0.4.1-3.5.noarch.rpm"
RPM_HASH = "7b024f97636e8591227295e92853f19e26c9dad513f5517191b5128a812712aa2353296ffb10042e1063e81f57f621abfffbec20c79d5c84e6cd4a4eee6d5403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xerox \
python3.13dist-xerox \
python313-xerox \
python3dist-xerox"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives \
xclip"

inherit rpm
