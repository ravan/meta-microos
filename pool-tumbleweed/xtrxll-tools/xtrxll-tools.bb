SUMMARY = "Low level tools for XTRX"
DESCRIPTION = "Low level tools for XTRX SDR devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrxll-tools-0.0.0+git.20201202-3.9.aarch64.rpm"
RPM_HASH = "59c982b7c5dd3b5baf2f81eba76ef5abab123df144331b2662eb16c26126169dcde44a150ea5f55d422ce7eb01497b60c4347bb9c760da3618aa41216542570a"

RPROVIDES:${PN} += "xtrxll-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxtrxll.so.0"

inherit rpm
