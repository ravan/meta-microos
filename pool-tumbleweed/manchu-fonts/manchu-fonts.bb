SUMMARY = "Manchu Unicode Fonts"
DESCRIPTION = "Font for the Manchu script"
LICENSE = "OFL-1.1 & GFDL-1.2+"

PV = "2.007+svn77"

RPM_NAME = "manchu-fonts-2.007+svn77-1.23.noarch.rpm"
RPM_HASH = "32767ec6ec3e5eaf56a4d49e9846f1e1a8543884c85c5ef84ed95f65d7f7203fc22e8ba68d967ed2fb064a8df935452399c93efd646aefcc87545dca08d65e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "manchu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
