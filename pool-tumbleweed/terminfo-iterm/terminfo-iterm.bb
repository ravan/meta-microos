SUMMARY = "A terminal descriptions database for iterm"
DESCRIPTION = "This package includes some useful entries for the iterm utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "terminfo-iterm-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "930cc07a86853daa26cf388475971e6c493722e71730ad8220f74d7b1dae0627c8c86bdeb0fd5f4398f01754b96b93ff700d15d7f3bbbe29f33dfcae640ed6c1"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/i/iTerm.app \
terminfo-iterm"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
