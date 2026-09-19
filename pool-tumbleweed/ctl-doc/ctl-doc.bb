SUMMARY = "Documentation files for CTL"
DESCRIPTION = "This package provides documentation for CTL."
LICENSE = "AMPAS"

PV = "1.5.5"

RPM_NAME = "ctl-doc-1.5.5-1.4.noarch.rpm"
RPM_HASH = "ba9beffc5ab270498e662100acd31a63d414266d9af3631ba427e369ce17aaf5a2f2b82675286fd8991cb813a80093747ba5288d4d840e94290011637ba6de5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ctl-doc"

RDEPENDS:${PN} += ""

inherit rpm
