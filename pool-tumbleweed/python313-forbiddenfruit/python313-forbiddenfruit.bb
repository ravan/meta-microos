SUMMARY = "Python module to patch python built-in objects"
DESCRIPTION = "This project allows you to patch built-in objects, declared in C through \
python."
LICENSE = "GPL-3.0-only | MIT"

PV = "0.1.4"

RPM_NAME = "python313-forbiddenfruit-0.1.4-4.2.aarch64.rpm"
RPM_HASH = "5f992be26e43d9a1a9c85ae6415442120ce33db7c20bbc623bedf78aa55eacf86382e74f457acc5ddb5a82cbdcf0bb0da6db0b4777ff24eb299c8b5a466ac1de"

RPROVIDES:${PN} += "python3-forbiddenfruit \
python3.13dist-forbiddenfruit \
python313-forbiddenfruit \
python3dist-forbiddenfruit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
