SUMMARY = "A KeePass plugin for Have I been pwned"
DESCRIPTION = "A Keepass plugin that performs offline and online checks against HaveIBeenPwned passwords. \
Check can be performed both during password generation and editing or in batch over the whole \
database."
LICENSE = "GPL-3.0-only"

PV = "1.7.11"

RPM_NAME = "keepass-plugin-HIBPOfflineCheck-1.7.11-1.10.noarch.rpm"
RPM_HASH = "501ef00b1e4a0ec48b1622f088a58be77b25f54ffdb84010cb511aad07119f266299de3619ffc56202a6f19708658b63b71a7cb4a2d5180f21c936b1013ea6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepass-plugin-HIBPOfflineCheck \
mono-HIBPOfflineCheck"

RDEPENDS:${PN} += "keepass \
mono-KeePass \
mono-System \
mono-System.Drawing \
mono-System.Windows.Forms \
mono-mscorlib"

inherit rpm
