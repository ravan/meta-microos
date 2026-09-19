SUMMARY = "Mail import functionality for KDE PIM applications"
DESCRIPTION = "The mailimporter library is a KDE PIM project to provide a framework \
for importing mail from different formats into Mail User Agents such as \
KMail or Kontact."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "mailimporter-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c28407b0e592e4738913090cc54ab37f0e4089867d9ca1b4606949cc145a69ef627091b16c56fda4baeeec50eaeb00632b0e05dc157d9778f602dbad0ade28e8"

RPROVIDES:${PN} += "mailimporter"

RDEPENDS:${PN} += ""

inherit rpm
