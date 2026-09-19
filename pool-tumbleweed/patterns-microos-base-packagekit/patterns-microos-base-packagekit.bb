SUMMARY = "openSUSE MicroOS using PackageKit"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the PackageKit service. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-packagekit-5.0-111.1.aarch64.rpm"
RPM_HASH = "1a30a92342c857d658afd47da2857eae333d39df27bd83515b34ddddd229f6a0584c7ce29ef224f3f24764f1ea239a8d663835b46c30c4dcdc586803d4149c6d"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base-packagekit"

RDEPENDS:${PN} += "PackageKit \
PackageKit-branding-openSUSE \
libdnf5-plugin-txnupd \
pattern-"

inherit rpm
