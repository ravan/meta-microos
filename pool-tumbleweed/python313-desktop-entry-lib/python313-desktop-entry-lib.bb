SUMMARY = "A library for working with .desktop files"
DESCRIPTION = "desktop-entry-lib allows reading and writing .desktop files according to the \
Desktop Entry Specification."
LICENSE = "BSD-2-Clause"

PV = "5.0"

RPM_NAME = "python313-desktop-entry-lib-5.0-3.2.noarch.rpm"
RPM_HASH = "506356142bbd74d1828dc24b82057587803c07204daef09ca1042d7731ba2377b691f914d34be78c6c513f8a829e4c1890b0555c453a60a2bf3bd9ebcd968d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-desktop-entry-lib \
python3.13dist-desktop-entry-lib \
python313-desktop-entry-lib \
python3dist-desktop-entry-lib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
