SUMMARY = "Header files for the Emu10k1 patch loader"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.8p1"

RPM_NAME = "ld10k1-devel-0.1.8p1-29.4.aarch64.rpm"
RPM_HASH = "0c90b684c62ff90ccc94dd6a90665fdf64d8799a04be4520209012c2c7872cea5941b7f8b571d56c18c00dd7a9f5b1bc5d7097e5518566035fa0551408270498"

RPROVIDES:${PN} += "alsa-tools-devel \
ld10k1-devel"

RDEPENDS:${PN} += "liblo10k1-0"

inherit rpm
