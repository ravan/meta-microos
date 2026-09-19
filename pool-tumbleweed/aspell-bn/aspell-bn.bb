SUMMARY = "Bengali (বাংলা) Dictionary for Aspell"
DESCRIPTION = "A Bengali (বাংলা) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.1"

RPM_NAME = "aspell-bn-0.01.1-4.7.aarch64.rpm"
RPM_HASH = "624f15a46a8528e98642c0a6f1b0127d7cd4e10499030e9d5831b19d1d0554f4c2124e1a94aa27fbb2f56c53045b7f556286c35bc08ac656f9b51823fd8925ab"

RPROVIDES:${PN} += "aspell-bn \
locale-aspell-bn"

RDEPENDS:${PN} += ""

inherit rpm
