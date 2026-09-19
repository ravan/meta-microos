SUMMARY = "Common Gataway Interface for Octave"
DESCRIPTION = "Common Gateway Interface for Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-2.0+"

PV = "0.1.2"

RPM_NAME = "octave-forge-cgi-0.1.2-1.20.noarch.rpm"
RPM_HASH = "590c3fc6423ebd21892991936c98b49c98990cfe04cdc163ebe763e8a0b5b4f9d06f7469da7145e7be68f60943001910d10924eb8f8ae32ce3a71f46b403cf82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-cgi"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
