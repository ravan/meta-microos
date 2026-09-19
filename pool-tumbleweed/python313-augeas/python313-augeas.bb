SUMMARY = "Python bindings for Augeas"
DESCRIPTION = "Python bindings for Augeas, a library for programmatically editing \
configuration files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "python313-augeas-1.2.0-1.10.aarch64.rpm"
RPM_HASH = "ab6a5ae3ec77b73f12ac02dc94af4efddd51e41672102376dbde7a3bf8d7924316e624f2f8806e1d9a2f12df3cd730f0b6a55c874575a00c94471b8f83da7ee6"

RPROVIDES:${PN} += "python3-augeas \
python3.13dist-python-augeas \
python313-augeas \
python3dist-python-augeas"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6 \
python-abi \
python313-cffi"

inherit rpm
