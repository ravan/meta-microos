SUMMARY = "Colorize your kubectl output"
DESCRIPTION = "A command-line wrapper used to add colors to your kubectl output"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "kubecolor-0.7.1-1.1.aarch64.rpm"
RPM_HASH = "c67decd3895f2a721df9fdcdc398c88a2652ad3a696eee2c31a53fdc871a95574deb5b8cacddff116b8a96177bf4a5667136abb603ab864c19461ca39ceb7d0c"

RPROVIDES:${PN} += "kubecolor"

RDEPENDS:${PN} += "kubernetes-client-provider \
libc.so.6"

inherit rpm
