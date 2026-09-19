SUMMARY = "GNU Aspell - Ispell compatibility"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains an ispell script for compatibility reasons so that \
programs that expect the 'ispell' command will work correctly."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8.2"

RPM_NAME = "aspell-ispell-0.60.8.2-1.3.aarch64.rpm"
RPM_HASH = "b4e8e049565c317354ed94326efe62359bcc7bb1a782219bf2b03c0a8a27ed2c67a9bf29afdcc9b81f722c7132b692421525f575f1b2bae680b9dbcb6d0f7855"

RPROVIDES:${PN} += "aspell-ispell"

RDEPENDS:${PN} += "aspell"

inherit rpm
