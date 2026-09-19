SUMMARY = "Simple Copy + Paste in Python"
DESCRIPTION = "Python copy and paste library supporting OS X, X11 (Linux, BSD, etc.), and Windows."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python314-xerox-0.4.1-3.5.noarch.rpm"
RPM_HASH = "5373df9a3ae44bbcc31e860d3c9a0cd2d7768937730a5096b9dae09b57d65ff28df960b453a74e87776908c2ce9066edebeb1d9e1bf7e7b0f9f9827ef8856ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xerox \
python314-xerox \
python3dist-xerox"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives \
xclip"

inherit rpm
