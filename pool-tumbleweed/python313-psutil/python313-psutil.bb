SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "7.2.2"

RPM_NAME = "python313-psutil-7.2.2-2.3.aarch64.rpm"
RPM_HASH = "85c27f7a675e33ae4f8a77524338f4508e2d84169d41f2c1b1b5288679146728518e976acd1f31aef4640f2cbdd1efccf48c5f6ad2a68143fcc0496f2eb1965a"

RPROVIDES:${PN} += "python3-psutil \
python3.13dist-psutil \
python313-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
