SUMMARY = "Punjabi (ਪੰਜਾਬੀ, پنجابی‎) Dictionary for Aspell"
DESCRIPTION = "A Punjabi (ਪੰਜਾਬੀ, پنجابی‎) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-pa-0.01-4.7.aarch64.rpm"
RPM_HASH = "21c39f5d3b36fec528b2d82b8dbfa7375f1549b6177e99a06608655bab427cc5e27d8053746675347605c30e60ace7fa58e21860eb0c48efc0fa38bd15539da0"

RPROVIDES:${PN} += "aspell-pa \
locale-aspell-pa"

RDEPENDS:${PN} += ""

inherit rpm
