SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python313-photutils-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "71f7cf976b38f0dc8aaa4ac2cab682ffdfffdb96e5ed3d1cb54d275514e02116cfe8ac6f97f16f744e5a0dd5ed3d4f38106fc0015cd5a93f2db3e95846712489"

RPROVIDES:${PN} += "python3-photutils \
python3.13dist-photutils \
python313-photutils \
python3dist-photutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-astropy \
python313-numpy \
python313-scipy"

inherit rpm
