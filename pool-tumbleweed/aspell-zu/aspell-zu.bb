SUMMARY = "Zulu (isiZulu) Dictionary Package for Aspell"
DESCRIPTION = "A Zulu (isiZulu) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50"

RPM_NAME = "aspell-zu-0.50-4.7.aarch64.rpm"
RPM_HASH = "c1b0fe4151096dc5de1e613283b318dd4b8e2807136914aa1ff7da0b7711e56e7c87326df5a0d9980ed01626909ec4061692c921ebecac3d1b415d79f6ae35df"

RPROVIDES:${PN} += "aspell-zu \
locale-aspell-zu"

RDEPENDS:${PN} += ""

inherit rpm
