SUMMARY = "New Swiss ispell dictionary"
DESCRIPTION = "This package includes a ready Swiss dictionary for ispell according \
the new spelling rules.  The name of the dictionary is nswiss to be able \
to distinguish it from those of the German packages. A short usage \
description is given in /usr/share/doc/packages/ispell/README of the \
package ispell."
LICENSE = "GPL-2.0-or-later"

PV = "20161207"

RPM_NAME = "ispell-nswiss-20161207-6.1.aarch64.rpm"
RPM_HASH = "e827fa0e8aa2c8f1fdf79793a6afed310871b9f1f3a60a355c6a85338ea045aea0752039e8e7bb4083b2cc3086fb0e96154a80c234bb7f4f0a1f4d7ccffdbf9d"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-nswiss \
locale-ispell-de-CH"

RDEPENDS:${PN} += ""

inherit rpm
