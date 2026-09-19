SUMMARY = "Demo for ryokucha"
DESCRIPTION = "Demo for ryokucha."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "ryokucha-demo-0.4.0-1.2.aarch64.rpm"
RPM_HASH = "f24269666f1c8417ce44ce264e6a486a3efeb99317ade26c6ef65c99ea0794750584d58454806a49a55d968bc9d0c3ea22129a032f66e80663941337aea51752"

RPROVIDES:${PN} += "ryokucha-demo"

RDEPENDS:${PN} += "libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libryokucha.so.0"

inherit rpm
