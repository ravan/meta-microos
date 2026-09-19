SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kwallet-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "62bbe4a9496052338acb2f6a67c4e5ff22653323a2c58412cfbf2ec41ea31505edf6ac35ae79904854a626bfcec8add5bc307dfcd2061c3fff89d0b8192d0677"

RPROVIDES:${PN} += "kf6-kwallet"

RDEPENDS:${PN} += ""

inherit rpm
