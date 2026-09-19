SUMMARY = "Old default theme for Terminology"
DESCRIPTION = "Old default theme for Terminology"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220216.1.26"

RPM_NAME = "terminology-theme-dark-20220216.1.26-2.2.noarch.rpm"
RPM_HASH = "7fe35b87bb6e3482957646ef6048be1e723d90f14d7652fde36be1c509031a7273f18cd93ab7fb5e299a3e6dae755a9889f027210a33f033b0baf67a88f96c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-dark"

RDEPENDS:${PN} += "terminology"

inherit rpm
