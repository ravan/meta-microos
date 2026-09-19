SUMMARY = "QTest accelerator for QEMU"
DESCRIPTION = "QTest is a device emulation testing framework. It is useful to test device \
models. \
 \
This package provides QTest accelerator for testing QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-accel-qtest-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "22670bc53a363a527b3984ac055071d81709ee8e8f0ccd46ee189c720d358f926f0d1894d647baac5654fd231d45e9dfe738f6454156bdb7a5a0eacceab162b8"

RPROVIDES:${PN} += "qemu-accel-qtest"

RDEPENDS:${PN} += ""

inherit rpm
