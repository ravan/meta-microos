SUMMARY = "Java online help system"
DESCRIPTION = "JavaHelp software is a full-featured, platform-independent, extensible \
help system that enables developers and authors to incorporate online \
help in applets, components, applications, operating systems, and \
devices. Authors can also use the JavaHelp software to deliver online \
documentation for the Web and corporate Intranet."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.05"

RPM_NAME = "javahelp2-manual-2.0.05-32.17.noarch.rpm"
RPM_HASH = "5f240b32ecd28335e5d5aa85a720329e47ca29576881c8742239fc6c0b6e44af69406886ea274e0801ac2e3e3881538caeaecf6f2f00d4f294fc89421f9b17c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javahelp2-manual"

RDEPENDS:${PN} += ""

inherit rpm
